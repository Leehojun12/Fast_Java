package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.OrderGroup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;


public class OrderGroupRepositoryTest extends StudyApplicationTests {

    @Autowired
    private OrderGroupRepository orderGroupRepository;

    @Test
    public void create(){
        OrderGroup orderGroup = new OrderGroup();
        orderGroup.setStatus("COMPLETE");
        orderGroup.setOrderType("CARD");
        orderGroup.setRevAddress("수원시 영통구");
        orderGroup.setRevName("이호준");
        orderGroup.setPaymentType("CARD");
        orderGroup.setTotalPrice(BigDecimal.valueOf(100000));
        orderGroup.setTotalQuantity(1);
        orderGroup.setOrderAt(LocalDateTime.now().minusDays(2));
        orderGroup.setArrivalDate(LocalDateTime.now());
        orderGroup.setCreatedAt(LocalDateTime.now());
        orderGroup.setCreatedBy("AdminServer");
       // orderGroup.setUserId(1L);

        OrderGroup newOrderGroup = orderGroupRepository.save(orderGroup);

        Assertions.assertNotNull(newOrderGroup);
    }
    @Test
    public void read(){

        Optional<OrderGroup> optionalOrderGroup = orderGroupRepository.findById(1L);

        optionalOrderGroup.ifPresent(c->{
            System.out.println(c.getId());
            System.out.println(c.getStatus());
            System.out.println(c.getArrivalDate());
        });
    }
    @Test
    public void update(){

    }
    @Test
    public void delete(){

    }

}
