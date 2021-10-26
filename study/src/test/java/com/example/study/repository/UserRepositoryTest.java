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
       String account = "Test02";
       String password = "1235";
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

      /* User u = User.builder()
               .account(account)
               .password(password)
               .status(status)
               .build();*/

       User newUser = userRepository.save(user);

        Assertions.assertNotNull(newUser);
    }
    @Test
    @Transactional
    public void read() {

        User user = userRepository.findFirstByPhoneNumberOrderByIdDesc("010-8974-2058");

        if(user != null) {
            user.getOrderGroupList().stream().forEach(orderGroup -> {
                System.out.println("-------------------- 주문조회 ----------------");
                System.out.println("수령인 : " + orderGroup.getRevName());
                System.out.println("수령지 :" + orderGroup.getRevAddress());
                System.out.println("총 금액 : " + orderGroup.getTotalPrice());
                System.out.println("총 수량 : " + orderGroup.getTotalQuantity());

                System.out.println("-------------------- 주문상세 ----------------");
                orderGroup.getOrderDetailList().forEach(orderDetail->{
                    System.out.println("파트너사 이름 : " +orderDetail.getItem().getPartner().getName());
                    System.out.println("파트너사 번호 : " +orderDetail.getItem().getPartner().getPartnerNumber());
                    System.out.println("파트너사 카테고리 :" +orderDetail.getItem().getPartner().getCategory().getType());
                    System.out.println("주문 상품 :" + orderDetail.getItem().getName());
                    System.out.println("고객센터 번호 : " + orderDetail.getItem().getPartner().getCallCenter());
                    System.out.println("주문 상태 :" +orderDetail.getStatus());
                    System.out.println("도착 예정 :" +orderDetail.getArrivalDate());

                });

            });
        }
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