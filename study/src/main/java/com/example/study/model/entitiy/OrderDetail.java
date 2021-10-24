package com.example.study.model.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //order_detail -- camel case
//@ToString(exclude = {"user", "item"}) // User user 와 item overflow 됨
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String status;
    private LocalDateTime arrivalDate;
    private Integer quantity;
    private BigDecimal totalPrice;
    private LocalDateTime OrderAt;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;








   // N : 1

   // @ManyToOne // Many: OrderDetail
   // private User user; // 객체 이름을 적어 줘야된다 user_id

   //N : 1
   //  @ManyToOne
   // private Item item;
}
