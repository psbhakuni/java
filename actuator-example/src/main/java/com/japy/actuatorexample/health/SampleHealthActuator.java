package com.japy.actuatorexample.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class SampleHealthActuator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        System.out.println("In SampleHealthActuator.doHealthCheck()...");
        builder.up()
                .withDetail("up", "Application is up and running.")
                .withDetail("error", "Application in erroneous state.");
    }
}
