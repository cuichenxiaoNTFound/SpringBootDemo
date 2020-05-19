package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class EmployeeAspect {
    @Before("execution(public String getName())")
    public void getNameAdvice() {
        log.info("----- Executing Advice on getName() -----");
    }

    @Before("execution(* com.example.demo.srv.*.get*())")
    public void getAllAdvice() {
        log.info("----- Service method gtter caller -----");
    }

}
