package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

public class OrderDetailRepositoryTest extends StudyApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setStatus("WAITING");
        orderDetail.setArrivalDate(LocalDateTime.now().plusDays(2));
        orderDetail.setQuantity(1);
        orderDetail.setTotalPrice(BigDecimal.valueOf(100000));
       // orderDetail.setOrderGroupId(1L); //어떠한 장바구니에
        //orderDetail.setItemId(1L); // 어떠한 상품
        orderDetail.setCreatedAt(LocalDateTime.now());
        orderDetail.setCreatedBy("AdminServer");

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
    public void Delete(){
        Optional<OrderDetail> orderDetail = orderDetailRepository.findById(2L);

        orderDetail.ifPresent(c->{
            orderDetailRepository.delete(c);
        });

        Optional<OrderDetail> deleteorderDetail = orderDetailRepository.findById(2L);
        if(deleteorderDetail.isPresent()){
            System.out.println("데이터 :" + deleteorderDetail.get());
        }else{
            System.out.println("데이터 없음, 데이터 삭제");
        }

    }

}
