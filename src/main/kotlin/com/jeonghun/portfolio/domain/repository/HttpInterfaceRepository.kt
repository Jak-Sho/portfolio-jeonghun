package com.jeonghun.portfolio.domain.repository

import com.jeonghun.portfolio.domain.entity.Achievement
import com.jeonghun.portfolio.domain.entity.Experience
import com.jeonghun.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository:JpaRepository<HttpInterface, Long> {


}