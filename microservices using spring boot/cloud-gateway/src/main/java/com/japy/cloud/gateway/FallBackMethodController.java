package com.japy.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        return "User service is taking too much time to respond. Please try after some time.";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack(){
        return "Department service is taking too much time to respond. Please try after some time.";
    }
}
