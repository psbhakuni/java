package com.japy.department.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.japy.department.entity.Department;
import com.japy.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
//@Slf4j
public class DepartmentController {
	private static final Logger log = Logger.getLogger(DepartmentController.class.getName());
	
	/*private static final org.slf4j.Logger log =
		    org.slf4j.LoggerFactory.getLogger(DepartmentController.class);
	*/
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside DepartmentController.saveDepartment");
        Department department2 = departmentService.saveDepartment(department);
        System.out.println(department2);
        return department2;
    }

    @GetMapping("/{id}")
    public Department findDepartmentIdById(@PathVariable("id") Long departmentId){
        log.info("Inside DepartmentController.findDepartmentIdById");
        return departmentService.findDepartmentIdById(departmentId);
    }

}
