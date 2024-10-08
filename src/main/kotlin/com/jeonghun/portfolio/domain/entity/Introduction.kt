package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Introduction: BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Introduction_id")
    var id: Long? = null
}