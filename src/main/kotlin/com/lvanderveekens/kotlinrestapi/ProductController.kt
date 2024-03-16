package com.lvanderveekens.kotlinrestapi

import java.math.BigDecimal
import java.util.UUID
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/products")
class ProductController(
    private val productRepository: ProductRepository
) {
    @PostMapping
    fun createProduct() {
        productRepository.save(
            Product(
                id = UUID.randomUUID().toString(),
                name = "iPhone 13 Pro",
                price = BigDecimal("1200.00")
            )
        )
    }

    @GetMapping
    fun getProducts(): List<Product> {
        return productRepository.findAll()
    }
}
