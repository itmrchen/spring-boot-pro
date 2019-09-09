package com.java8.springbootpro.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Java7 for循环实现{@link CaculateService}
 *
 * @author itmrchen
 * @date 2019/9/10 1:56
 */
@Service
@Profile("Java7")
public class Java7CaculateService implements CaculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java7 for循环实现");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        CaculateService caculateService = new Java7CaculateService();
        System.out.println(caculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
