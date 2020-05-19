package com.example.demo.srv;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.aspect.LogExecutionTime;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {
    private Employee employee;

    // @RequestMapping(value = "/get",
    // method = RequestMethod.GET)
    public Employee getEmployee() {
        return employee;
    }

    // @RequestMapping(value = "/set",
    // method = RequestMethod.POST)
    public void setEmployee(@RequestBody String name) {
        this.employee = new Employee();
        this.employee.setName(name);
    }

    // @RequestMapping(value = "/hello",
    // method = RequestMethod.GET)
    public String hello() {
        return "Hello employee";
    }

    @LogExecutionTime
    public void mockProcessing() throws InterruptedException {
        Thread.sleep(2000);
    }
}
