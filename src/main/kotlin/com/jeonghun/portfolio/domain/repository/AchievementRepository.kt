package com.jeonghun.portfolio.domain.repository

import com.jeonghun.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository:JpaRepository<Achievement,Long> {


}