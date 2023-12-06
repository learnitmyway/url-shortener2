package com.learnitmyway.urlshortener2.url

import org.springframework.data.mongodb.repository.MongoRepository

interface UrlRepository: MongoRepository<UrlEntity, String> {
    fun findByKey(key: String): UrlEntity?
}