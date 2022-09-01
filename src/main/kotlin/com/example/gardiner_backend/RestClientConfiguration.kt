package com.example.gardiner_backend

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import org.springframework.web.client.RestTemplate

@Configuration
class RestClientConfiguration {
    @get:Bean
    val restTemplate: RestTemplate
        get() = RestTemplate()
}