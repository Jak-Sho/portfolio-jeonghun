package com.jeonghun.portfolio.domain.repository

import com.jeonghun.portfolio.domain.entity.Achievement
import com.jeonghun.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository:JpaRepository<Introduction,Long> {

    fun findAllByIsActive(isActive:Boolean): List<Introduction>
}