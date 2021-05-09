package com.japy.sprintg.security.jwt.controller;

import com.japy.sprintg.security.jwt.JwtUtil;
import com.japy.sprintg.security.jwt.models.AuthenticationRequest;
import com.japy.sprintg.security.jwt.models.AuthenticationResponse;
import com.japy.sprintg.security.jwt.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/")
    public String welcomeForAll() {
        return "Welcome Geek!";
    }

    @GetMapping("/user")
    public String welcomeForUserAndAdminRole() {
        return "Welcome User!";
    }

    @GetMapping("/admin")
    public String welcomeForAdmin() {
        return "Welcome Admin!";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    authenticationRequest.getUserName(),
                    authenticationRequest.getPassword()
            ));
        } catch (BadCredentialsException badCredentialsException){
            throw new Exception("Incorrect user name or password", badCredentialsException);
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUserName());
        final String jwtToken = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwtToken));
    }
}
