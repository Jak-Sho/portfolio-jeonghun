package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class Link:BaseEntity() {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Link_id")
    var id: Long? = null

}