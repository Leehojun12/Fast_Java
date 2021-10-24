package com.example.study.repository;

import com.example.study.model.entitiy.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long>{
}
