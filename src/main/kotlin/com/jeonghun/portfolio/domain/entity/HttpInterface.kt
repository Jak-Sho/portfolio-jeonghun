package com.jeonghun.portfolio.domain.entity

import jakarta.persistence.*
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest

@Entity
class HttpInterface(httpServletRequest: HttpServletRequest): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Http_Interface_id")
    var id: Long? = null

    var cookies: String? = httpServletRequest.cookies
        ?.map{"${it.name}:${it.value}"}
        ?.toString()

    var referer: String? = httpServletRequest.getHeader("referer")

            var localAddr: String? = httpServletRequest.localAddr

    var remoteAddr: String? = httpServletRequest.remoteHost

    var requestUri: String? = httpServletRequest.requestURI

    var userAgent: String? = httpServletRequest.getHeader("user-agent")
}