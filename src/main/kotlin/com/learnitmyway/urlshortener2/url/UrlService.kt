package com.learnitmyway.urlshortener2.url

import org.springframework.stereotype.Service

@Service
class UrlService(val db: UrlRepository) {

    fun save(urlRequest: UrlRequest): UrlResponse {
        val shortUrl = toCrc32Hex(urlRequest.longUrl)
        val longUrl = urlRequest.longUrl
        val (id) = db.save(UrlEntity(longUrl = urlRequest.longUrl, shortUrl = shortUrl))
        return UrlResponse(id!!, shortUrl = "http://localhost:8081/v1/urls/$shortUrl", longUrl = longUrl)
    }

    fun get(shortUrl: String): UrlEntity? {
        return db.findByShortUrl(shortUrl)
    }
}
