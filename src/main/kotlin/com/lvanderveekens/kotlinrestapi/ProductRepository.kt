package com.lvanderveekens.kotlinrestapi

import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String>