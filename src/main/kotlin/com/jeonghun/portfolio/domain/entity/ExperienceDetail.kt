package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ExperienceDetail: BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Experience_Detail_id")
    var id: Long? = null
}