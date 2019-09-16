package com.java8.web.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

/**
 * spring web mvc配置类
 *
 * @author itmrchen
 * @date 2019/9/14 20:18
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(Ordered.LOWEST_PRECEDENCE - 10);
        return viewResolver;
    }

    /*@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("拦截中。。。");
                return true;
            }
        });
    }*/

    /*public WebServerFactoryCustomizer<TomcatServletWebServerFactory> customizer() {
        return (factory -> {
            factory.addContextCustomizers((context -> {
                String relativePath = "springboot-view/src/main/webapp";
                File docBaseFile = new File(relativePath);
                if (docBaseFile.exists()) {
                    context.setDocBase(docBaseFile.getAbsolutePath());
                }
            }));
        });
    }*/
}
