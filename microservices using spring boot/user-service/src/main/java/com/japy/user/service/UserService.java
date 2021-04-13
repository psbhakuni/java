package com.japy.user.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.japy.user.entity.User;
import com.japy.user.vo.Department;
import com.japy.user.vo.ResponseTemplateVO;

@Service
public class UserService {

    private static final Logger log = Logger.getLogger(UserService.class.getName());

    @Autowired
    private com.japy.user.repository.UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public com.japy.user.entity.User saveUser(com.japy.user.entity.User user) {
        log.info("Inside UserService.saveUser");
        return userRepository.save(user);
    }

    public com.japy.user.entity.User findUserIdById(Long userId) {
        log.info("Inside UserService.findUserIdById");
        com.japy.user.entity.User user = userRepository.findUserIdById(userId);
        log.info("User: " + user);
        return user;
    }

    public ResponseTemplateVO getUserIdWithDepartment(Long userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        log.info("Inside UserService.getUserIdWithDepartment");

        User user = userRepository.findUserIdById(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ user.getDepartmentId(), Department.class);
        //Department department = restTemplate.getForObject("http://localhost:9111/departments/"+ user.getDepartmentId(), Department.class);
       
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);

        return responseTemplateVO;
    }
}
