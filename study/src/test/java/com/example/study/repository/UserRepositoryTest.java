package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.User;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assert;
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
    @Transactional
    public void read() {
        // 쿼리문 : select * from user where id = ?
        Optional<User> user = userRepository.findByAccountAndEmail("Leehojun","dlghwns82@naver.com"); //Type이 Long이기떄문에 2L;;

        user.ifPresent(selectuser ->{

            selectuser.getOrderDetailList().stream().forEach(detail ->{ // List이기 떄문에 stream으로 쓴다

                System.out.println(detail.getItem());

            });
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
    @Transactional //rollback Data를 돌려놓을떄
    public void delete() {
        Optional<User> user = userRepository.findById(5L);

       // Assert.assertTrue(user.isPresent()); //true
        user.ifPresent(selectUser->{
            userRepository.delete(selectUser);
        });
        Optional<User> deleteUser = userRepository.findById(5L);

        if(deleteUser.isPresent()){
            System.out.println("데이터 : " + deleteUser.get());
        }else{
            System.out.println("데이터 삭제, 데이터 없음");
        }
       // Assert.assertFalse(deletUser.isPresent()); //false
    }
}