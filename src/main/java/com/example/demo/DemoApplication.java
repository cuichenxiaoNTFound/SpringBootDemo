package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.srv.EmployeeService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo"})
public class DemoApplication {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.setEmployee("new name");
        employeeService.getEmployee();
        employeeService.mockProcessing();
    }

}
