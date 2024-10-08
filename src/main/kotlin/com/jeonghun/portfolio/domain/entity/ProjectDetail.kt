package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
abstract class ProjectDetail(content:String,
                             isActive: Boolean,
                             url:String?
): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Project_Detail_id")
    var id: Long? = null

    var content: String = content

    var url: String? = url

    var isActive: Boolean = isActive

    fun update(content:String, isActive: Boolean, url:String?) {
        this.content = content
        this.isActive = isActive
        this.url=url

    }
}