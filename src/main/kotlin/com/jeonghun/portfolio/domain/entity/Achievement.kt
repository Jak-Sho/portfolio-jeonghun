package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity

class Achievement:BaseEntity() {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "achivement_id")
    var id: Long? = null

}