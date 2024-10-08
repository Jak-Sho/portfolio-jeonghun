package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Skill: BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Skill_id")
    var id: Long? = null
}