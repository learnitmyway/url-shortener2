package com.learnitmyway.urlshortener2.root

import com.learnitmyway.urlshortener2.url.UrlController
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/")
class RootController(val urlController: UrlController) {
    @GetMapping("{key}")
    fun show(@PathVariable key: String): ModelAndView {
        return urlController.show(key)
    }

    @GetMapping
    fun hello(): ResponseEntity<String> {
        return ResponseEntity("hello", HttpStatus.OK)
    }
}