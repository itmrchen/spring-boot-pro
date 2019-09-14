package com.java8.web.servlet.support;

import com.java8.web.config.DispatcherServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Spring MVC 自动装配的实现
 *
 * @author itmrchen
 * @date 2019/9/14 23:33
 */
public class DefaultAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() { //web.xml
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { //DispatcherServlet
        return new Class[]{DispatcherServletConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
