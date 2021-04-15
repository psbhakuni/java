package com.japy.actuatorexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Geek!";
    }

    @GetMapping("/waitforhello")
    public String sampleRequest(@RequestParam(value = "wait", defaultValue = "0") Integer wait) throws InterruptedException {
        if (wait == 0) {
            Random random = new Random();
            wait = random.nextInt(10);
        }
        TimeUnit.SECONDS.sleep(wait);

        return "Hello Geek!. Sorry to keep you waiting for "+ wait + " seconds.";
    }
}
