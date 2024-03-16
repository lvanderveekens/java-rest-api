package com.lvanderveekens.kotlinrestapi

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "product")
data class Product(
    @Id
    @Column(name = "id")
    val id: String,
    @Column(name = "name")
    val name: String,
    @Column(name = "price")
    val price: BigDecimal
)
