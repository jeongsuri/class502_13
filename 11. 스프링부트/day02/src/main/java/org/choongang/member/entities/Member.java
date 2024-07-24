package org.choongang.member.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.constants.Authority;

@Builder
@Data
@Entity //엔티티 에노테이션 설정하면 자동으로 테이블이 생성
@NoArgsConstructor
@AllArgsConstructor
//@Table(name="CH_MEMBER")
/*
@Table(indexes ={
        @Index(name="idx_created_at_desc", columnList = "createdAt DESC"),
        @Index(name="up_email_password", columnList = "email, password", unique = true)
}) //인덱스설정
 */
public class Member extends BaseEntity {
    @Id @GeneratedValue
    private Long seq;
    @Column(length = 60, nullable = false, unique = true)
    private String email;
    @Column(length = 65, nullable = false)
    private String password;

    @Column(length = 40, nullable = false, name ="name")
    private String userName;

    //@Lob
    @Transient
    private String introduction;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private Authority authority;
}
