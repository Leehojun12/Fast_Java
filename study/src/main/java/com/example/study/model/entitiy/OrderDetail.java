package com.example.study.model.entitiy;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = {"orderGroup","item"})
@EntityListeners(AuditingEntityListener.class) // 감시자를 하겠다 설정;;
@Builder // 편하게 생성자를 만듬
@Accessors(chain = true) // 체인 형식으로 .으로 불러온다

public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String status;
    private LocalDateTime arrivalDate;
    private Integer quantity;
    private BigDecimal totalPrice;
    @CreatedDate //따로 안해도 자동으로 수정이 된다
    private LocalDateTime createdAt;
    @CreatedBy // By는 getCurrentAuditor에서 return 한다
    private String createdBy;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    @LastModifiedBy
    private String updatedBy;
   // private Long OrderGroupId;
   // private Long ItemId;


    // OrderDetail N : 1 OrderGroup
    @ManyToOne
    private OrderGroup orderGroup;

    @ManyToOne
    private Item item;
}
