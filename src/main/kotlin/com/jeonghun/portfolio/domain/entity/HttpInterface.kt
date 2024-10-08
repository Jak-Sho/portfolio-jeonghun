package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class HttpInterface: BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Http_Interface_id")
    var id: Long? = null
}