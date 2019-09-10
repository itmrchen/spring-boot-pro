package com.java8.springbootpro.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * java 系统属性条件判断
 *
 * @author itmrchen
 * @date 2019/9/11 0:17
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {
    /**
     * java系统属性名称
     *
     * @return
     */
    String name();

    /**
     * java系统属性值
     *
     * @return
     */
    String value();

}
