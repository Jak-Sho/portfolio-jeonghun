package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ProjectDetail: BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Project_Detail_id")
    var id: Long? = null
}