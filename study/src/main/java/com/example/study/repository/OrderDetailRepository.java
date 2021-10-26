package com.example.study.repository;

import com.example.study.model.entitiy.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long>{

    Optional<OrderDetail> findById(String id);
}
