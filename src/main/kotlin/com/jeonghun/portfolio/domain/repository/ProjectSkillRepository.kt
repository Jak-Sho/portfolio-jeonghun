package com.jeonghun.portfolio.domain.repository

import com.jeonghun.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository:JpaRepository<ProjectSkill, Long> {


}