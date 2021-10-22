package com.example.study.repository;

import com.example.study.model.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Repository다 선언
public interface UserRepository extends JpaRepository<User, Long>{
// JPA를 상속받게 되면 기본적인 CRUD를 제공받을 수 있다
}
