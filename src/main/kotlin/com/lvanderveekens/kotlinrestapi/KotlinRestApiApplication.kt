package com.lvanderveekens.kotlinrestapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinRestApiApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinRestApiApplication::class.java, *args)
}
