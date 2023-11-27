package com.learnitmyway.urlshortener2.url

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("urls")
data class UrlEntity(@Id var id: String? = null, val longUrl: String, val shortUrl: String)
