package com.learnitmyway.urlshortener2.url

import org.springframework.stereotype.Service

@Service
class UrlService(val db: UrlRepository) {

    fun save(urlRequest: UrlRequest) {
        db.save(UrlEntity(longUrl = urlRequest.longUrl, shortUrl = urlRequest.longUrl))
    }
}
