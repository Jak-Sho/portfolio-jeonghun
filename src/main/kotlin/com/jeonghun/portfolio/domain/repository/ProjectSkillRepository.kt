package com.jeonghun.portfolio.domain.repository

import com.jeonghun.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectSkillRepository:JpaRepository<ProjectSkill, Long> {

    fun findByProjectIdAndSkillID(proejctId: Long, SkillID:Long): Optional<ProjectSkill>
}