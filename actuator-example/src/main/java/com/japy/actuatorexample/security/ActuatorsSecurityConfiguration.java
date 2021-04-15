package com.japy.actuatorexample.security;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.actuate.context.ShutdownEndpoint;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
docker run     -p 9090:9090     -v D:/IdeaProjects/actuator-example/src/main/resources/prometheus.yml:/etc/prometheus/prometheus.yml     prom/prometheus

 */
@Configuration
public class ActuatorsSecurityConfiguration extends WebSecurityConfigurerAdapter {

    /* 1. Restrict access to the Shutdown endpoint to the ADMIN_ROLE role.
        2. Allow access to all other actuator endpoints.
        3. Allow access to static resources.
        4. Allow access to the home page (/).
        5. All other requests need to be authenticated.
        6. Enable http basic authentication to make the configuration complete.
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()

                .requestMatchers(EndpointRequest.to(ShutdownEndpoint.class))
                .hasRole("ADMIN_ROLE")

                .requestMatchers(EndpointRequest.toAnyEndpoint())
                .permitAll()

                .requestMatchers(PathRequest.toStaticResources().atCommonLocations())
                .permitAll()

                .antMatchers("/")
                .permitAll()

                .antMatchers("/**")
                .authenticated()

                .and()
                .httpBasic();

    }
}

