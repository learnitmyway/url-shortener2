package com.learnitmyway.urlshortener2.url

import org.springframework.stereotype.Service

@Service
class UrlService(val db: UrlRepository) {

    fun save(urlRequest: UrlRequest) {
        val shortUrl = toCrc32Hex(urlRequest.longUrl)
        db.save(UrlEntity(longUrl = urlRequest.longUrl, shortUrl = shortUrl))
    }

    fun get(shortUrl: String): UrlEntity? {
        return db.findByShortUrl(shortUrl)
    }
}
