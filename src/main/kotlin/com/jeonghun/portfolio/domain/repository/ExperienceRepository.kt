package com.jeonghun.portfolio.domain.repository

import com.jeonghun.portfolio.domain.entity.Achievement
import com.jeonghun.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository:JpaRepository<Experience, Long> {

    fun findAllByIsActive(isActive:Boolean): List<Experience>
}