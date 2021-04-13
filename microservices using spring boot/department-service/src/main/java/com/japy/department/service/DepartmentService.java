package com.japy.department.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.japy.department.entity.Department;
import com.japy.department.repository.DepartmentRepository;

@Service
//@Slf4j
public class DepartmentService {

	private static final Logger log = Logger.getLogger(DepartmentService.class.getName());
	/*private static final org.slf4j.Logger log =
		    org.slf4j.LoggerFactory.getLogger(DepartmentService.class);
	*/
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside DepartmentService.saveDepartment");
        return departmentRepository.save(department);
    }

    public Department findDepartmentIdById(Long departmentId) {
        log.info("Inside DepartmentService.findDepartmentIdById");
        Department department = departmentRepository.findDepartmentIdById(departmentId);
        log.info("Department: " + department);
        return department;
    }
}
