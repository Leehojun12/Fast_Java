package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;


public class UserRepositoryTest extends StudyApplicationTests {

    // Dependency Injection (DI)
    @Autowired
    UserRepository userRepository; // = new UserRepository(); 생략

    @Test//테스트코드를 작성할때 필수 어노테이션
    public void create() {
       String account = "Test01";
       String password = "1234";
       String status = "REGISTERED";
       String email = "dlghwns82@naver.com";
       String phoneNumber = "010-8974-2058";
       LocalDateTime registeredAt = LocalDateTime.now();
       LocalDateTime createdAt = LocalDateTime.now();
       String createdBy = "AdminServer";

       User user = new User();
       user.setAccount(account);
       user.setPassword(password);
       user.setStatus(status);
       user.setEmail(email);
       user.setPhoneNumber(phoneNumber);
       user.setRegisteredAt(registeredAt);
       user.setCreatedAt(createdAt);
       user.setCreatedBy(createdBy);

       User newUser = userRepository.save(user);

        Assertions.assertNotNull(newUser);
    }
    @Test
    @Transactional
    public void read() {

        User user = userRepository.findFirstByPhoneNumberOrderByIdDesc("010-8974-2058");
        Assertions.assertNotNull(user);


    }
    @Test
    public void update() {

    }
    @Test
    @Transactional //rollback Data를 돌려놓을떄
    public void delete() {

    }
}