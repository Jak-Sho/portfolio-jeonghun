package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ProjectSkill: BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Project_Skill_id")
    var id: Long? = null
}