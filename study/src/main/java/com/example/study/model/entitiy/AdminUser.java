package com.example.study.model.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@EntityListeners(AuditingEntityListener.class) // 감시자를 하겠다 설정;;
@Builder // 편하게 생성자를 만듬
@Accessors(chain = true) // 체인 형식으로 .으로 불러온다
public class AdminUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// mysql은 identity;;
    private Long id;
    private String account;
    private String password;
    private String status;
    private String role;
    private LocalDateTime lastLoginAt;
    private LocalDateTime passwordUpdatedAt;
    private int loginFailCount;
    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;
    @CreatedDate //따로 안해도 자동으로 수정이 된다
    private LocalDateTime createdAt;
    @CreatedBy // By는 getCurrentAuditor에서 return 한다
    private String createdBy;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    @LastModifiedBy
    private String updatedBy;

}
