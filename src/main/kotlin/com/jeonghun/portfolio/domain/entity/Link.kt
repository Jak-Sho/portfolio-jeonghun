package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class Link(
    name:String,
    content:String,
    isActive: Boolean
):BaseEntity() {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Link_id")
    var id: Long? = null

    override var name: String = name

    var content: String = content

    var isActive: Boolean = isActive

}