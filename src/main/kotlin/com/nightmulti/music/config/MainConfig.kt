package com.nightmulti.music.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class MainConfig: WebMvcConfigurer {

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/BACKGROUND/**").addResourceLocations("file:" + "/home/miku/cdn/BACKGROUND/")
        registry.addResourceHandler("/PROFILE_PHOTO/**").addResourceLocations("file:" + "/home/miku/cdn/PROFILE_PHOTO/")
    }

}
