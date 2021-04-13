package com.japy.user.controller;

import com.japy.user.entity.User;
import com.japy.user.service.UserService;
import com.japy.user.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger log = Logger.getLogger(UserController.class.getName());

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside UserController.saveUser");
        return userService.saveUser(user);
    }

    /*@GetMapping("/{id}")
    public User findUserIdById(@PathVariable("id") Long userId){
        log.info("Inside UserController.findUserIdById");
        return userService.findUserIdById(userId);
    }*/

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserIdWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside UserController.getUserIdWithDepartment");
        return userService.getUserIdWithDepartment(userId);
    }

}
