package com.learnitmyway.urlshortener2.url

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/v1/urls")
class UrlController(val service: UrlService) {

    @PostMapping
    fun create(@RequestBody url: UrlRequest): ResponseEntity<UrlResponse> {
        val body = service.save(url)
        return ResponseEntity(body, HttpStatus.CREATED)
    }

    @GetMapping("/{shortUrl}")
    fun show(@PathVariable shortUrl: String): ModelAndView {
        val urlEntity = service.get(shortUrl) ?: throw NotFoundException()

        return ModelAndView("redirect:${urlEntity.longUrl}")

    }
}