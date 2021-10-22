package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.User;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

    // Dependency Injection (DI)
    @Autowired
    UserRepository userRepository; // = new UserRepository(); 생략

    @Test//테스트코드를 작성할때 필수 어노테이션
    public void create() {
        // String sql = insert into user(%s, %s, %d) value (account, email, age); 이런식으로 작성- DI (X)
        User user = new User();

        //AI는 지정하지 않아도 된다. 자동으로 increment 되기 때문 (id)
        user.setAccount("Leehojun");
        user.setEmail("dlghwns82@naver.com");
        user.setPhoneNumber("010-8974-2058");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser = userRepository.save(user);
        System.out.println("newUser : " + newUser);

    }
    @Test
    public void read() {
        Optional<User> user = userRepository.findById(2L); //Type이 Long이기떄문에 2L;;

        user.ifPresent(selectuser ->{
            System.out.println("user : " + user);
        });
    }
    @Test
    public void update() {
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectuser ->{
            selectuser.setAccount("pppp");
            selectuser.setCreatedAt(LocalDateTime.now());
            selectuser.setCreatedBy("update method()");

            userRepository.save(selectuser);
        });
    }
    @Test
    public void delete() {
        Optional<User> user = userRepository.findById(3L);

        Assert.assertTrue(user.isPresent()); //true
        user.ifPresent(selectUser->{
            userRepository.delete(selectUser);
        });
        Optional<User> deletUser = userRepository.findById(3L);

        Assert.assertFalse(deletUser.isPresent()); //false
    }
}