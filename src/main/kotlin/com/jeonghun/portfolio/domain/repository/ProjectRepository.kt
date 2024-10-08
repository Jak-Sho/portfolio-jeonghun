package com.jeonghun.portfolio.domain.repository

import com.jeonghun.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectRepository:JpaRepository<Project, Long> {

    fun findAllByIsActive(isActive:Boolean): List<Project>

}