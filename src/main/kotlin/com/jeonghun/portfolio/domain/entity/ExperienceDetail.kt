package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ExperienceDetail(content:String,
                                isActive: Boolean
): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Experience_Detail_id")
    var id: Long? = null

    var content: String = content

    var isActive = isActive

    fun update(content:String, isActive: Boolean) {
        this.content = content
        this.isActive = isActive

    }
}