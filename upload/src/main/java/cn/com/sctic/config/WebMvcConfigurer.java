package cn.com.sctic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    @Value("${scitc.upload.src}")
    private String src;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(src + "/**").addResourceLocations("file:" + src);
    }
}
