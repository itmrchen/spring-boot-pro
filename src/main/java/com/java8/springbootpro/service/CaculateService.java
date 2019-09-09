package com.java8.springbootpro.service;

/**
 * 计算服务
 *
 * @author itmrchen
 * @date 2019/9/10 1:54
 */
public interface CaculateService {
    /**
     * 对多个整数计算求和
     *
     * @param values
     * @return
     */
    Integer sum(Integer... values);
}
