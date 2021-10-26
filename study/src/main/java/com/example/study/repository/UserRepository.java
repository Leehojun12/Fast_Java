package com.example.study.repository;

import com.example.study.model.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //Repository다 선언
public interface UserRepository extends JpaRepository<User, Long>{

    // 같은 번호로 여러명이 가입할수 있기 떄문에
    User findFirstByPhoneNumberOrderByIdDesc(String phoneNumber);

}
