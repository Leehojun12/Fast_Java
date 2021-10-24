package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class OrderDetailRepositoryTest extends StudyApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderAt(LocalDateTime.now());

        //어떤 사용자
        //orderDetail.setUserId(7L);

        // 어떤 상품
       // orderDetail.setItemId(1L);

        OrderDetail newOrderDatail = orderDetailRepository.save(orderDetail);
        System.out.println(newOrderDatail);

    }

    @Test
    public void read(){

        Long id = 1L;

        Optional<OrderDetail> orderDetail = orderDetailRepository.findById(id);

        orderDetail.ifPresent(i ->{
            System.out.println(i);
        });
    }

    @Test
    public void Update(){
    }

    @Test
    @Transactional
    public void delete(){

    }

}
