package com.java8.springbootpro.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Java8 Lambda实现{@link CaculateService}
 *
 * @author itmrchen
 * @date 2019/9/10 1:56
 */
@Service
@Profile("Java8")
public class Java8CaculateService implements CaculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java8 Lambda实现");
        return Stream.of(values).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        CaculateService caculateService = new Java8CaculateService();
        System.out.println(caculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
