package com.learnitmyway.urlshortener2.url

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Update

interface UrlRepository: MongoRepository<UrlEntity, String> {
    fun findByShortUrl(shortUrl: String): UrlEntity?
}