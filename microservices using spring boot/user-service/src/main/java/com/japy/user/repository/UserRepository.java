package com.japy.user.repository;

import com.japy.user.vo.ResponseTemplateVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<com.japy.user.entity.User, Long> {

    com.japy.user.entity.User findUserIdById(Long userId);

   // ResponseTemplateVO getUserIdWithDepartment(Long userId);
}
