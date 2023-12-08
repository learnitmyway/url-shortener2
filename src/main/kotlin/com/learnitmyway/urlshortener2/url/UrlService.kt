package com.learnitmyway.urlshortener2.url

import org.springframework.stereotype.Service

@Service
class UrlService(val db: UrlRepository) {

    fun save(urlRequest: UrlRequest): UrlResponse {
        val shortUrl = toCrc32Hex(urlRequest.longUrl)
        val longUrl = urlRequest.longUrl
        db.save(UrlEntity(longUrl = urlRequest.longUrl, key = shortUrl))
        return UrlResponse(shortUrl = "/v1/urls/$shortUrl", longUrl = longUrl)
    }

    fun get(urlKey: String): UrlEntity? {
        return db.findByKey(urlKey)
    }
}
