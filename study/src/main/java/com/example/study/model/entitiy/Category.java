package com.example.study.model.entitiy;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString(exclude = {"partner"})
@EntityListeners(AuditingEntityListener.class) // 감시자를 하겠다 설정;;
@Builder // 편하게 생성자를 만듬
@Accessors(chain = true) // 체인 형식으로 .으로 불러온다

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String title;
    @CreatedDate //따로 안해도 자동으로 수정이 된다
    private LocalDateTime createdAt;
    @CreatedBy // By는 getCurrentAuditor에서 return 한다
    private String createdBy;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    @LastModifiedBy
    private String updatedBy;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "category")
    private List<Partner> partnerList;
}
