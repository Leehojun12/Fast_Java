package com.example.study.model.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String status;
    private String name;
    private String title;
    private String content;
    private Integer price;
    private String brandName;
    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
    private Long partnerId;


    // 1 : N

    // LAZY = 지연로딩, EAGER = 즉시 로딩
    // LAZY = SELECT * FROM item where id = ? (추천)

    // EAGER = 1 : 1 (한건만 할 때 사용 추천)
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?
    // JOIN item item0_ Left outer join order_detail orderdetail_ on item0_.id=orderdetail_.item_id Left outer join user
    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
    //private List<OrderDetail> orderDetailList;
}
