package com.example.study.model.entitiy;

import lombok.*;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Data // annotation Getter &Setter 메서드 생성
@AllArgsConstructor //모든 매개변수를 가지는 생성자
@NoArgsConstructor
@Entity
public class User {

    @Id // 식별자로 ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 어떤 식으로 관리 할것인가..?
    private long id;
    private String account;
    private String password;
    private String status;
    private String email;
    private String phoneNumber;
    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    // 1 : N
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user") // One : User
    private List<OrderDetail> orderDetailList;
}
