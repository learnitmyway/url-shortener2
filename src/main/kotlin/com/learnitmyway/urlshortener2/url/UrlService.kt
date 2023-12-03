package com.learnitmyway.urlshortener2.url

import org.springframework.stereotype.Service

@Service
class UrlService(val db: UrlRepository) {

    fun save(urlRequest: UrlRequest) {
        db.save(UrlEntity(longUrl = "https://" + urlRequest.longUrl, shortUrl = urlRequest.longUrl))
    }

    fun get(shortUrl: String): UrlEntity? {
        return db.findByShortUrl(shortUrl)
    }

}
