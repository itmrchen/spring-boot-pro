package com.java8.springbootpro.bootstrap;

import com.java8.springbootpro.service.CaculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link CaculateService} 引导类
 *
 * @author itmrchen
 * @date 2019/9/10 2:09
 */
@SpringBootApplication(scanBasePackages = "com.java8.springbootpro.service")
public class CaculateServiceBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CaculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);
        CaculateService caculateService = context.getBean(CaculateService.class);
        System.out.println("CaculateServiceBootstrap.main:" + caculateService.sum(1, 2, 3));
        context.close();

    }
}
