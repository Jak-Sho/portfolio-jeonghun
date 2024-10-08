package com.jeonghun.portfolio.domain.repository

import com.jeonghun.portfolio.domain.constant.SkillType
import com.jeonghun.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SkillRepository:JpaRepository<Skill, Long> {

    fun findAllByIsActive(isActive:Boolean): List<Skill>

    fun findByNameIgnoreCaseAndType(name : String, type : SkillType): Optional<Skill>
}