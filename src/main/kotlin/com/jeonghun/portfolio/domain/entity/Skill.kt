package com.jeonghun.portfolio.domain.entity

import com.jeonghun.portfolio.domain.constant.SkillType
import jakarta.persistence.*

@Entity
class Skill(
    name:String,
    type:String,
    isActive:Boolean
): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Skill_id")
    var id: Long? = null

    var name:String = name

    @Column(name="Skill_type")
    @Enumerated(value = EnumType.STRING)
    var type:SkillType = SkillType.valueOf(type)

    var isActive:Boolean = isActive

}