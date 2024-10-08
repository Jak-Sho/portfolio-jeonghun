package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity

abstract class Achievement(
    title:String,
    description:String,
    achievedDate: LocalDate?,
    host:String,
    isActive:Boolean
):BaseEntity(

) {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "achivement_id")
    var id: Long? = null

    var title:String = title
    var description:String = description
    var achievedDate: LocalDate? = achievedDate
    var host:String = host
    var isActive:Boolean = isActive
}