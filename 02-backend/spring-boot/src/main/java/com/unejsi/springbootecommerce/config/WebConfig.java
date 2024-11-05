package com.unejsi.springbootecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow all paths
                .allowedOrigins("https://angular-ecommerce-6tl8wxwrg-aminas-projects-af44ab96.vercel.app") // Add your Vercel URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Add allowed methods
                .allowCredentials(true);
    }
}
