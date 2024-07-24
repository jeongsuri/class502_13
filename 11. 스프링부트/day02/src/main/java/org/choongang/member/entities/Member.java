package org.choongang.member.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.constants.Authority;

@Data
@Entity //엔티티 에노테이션 설정하면 자동으로 테이블이 생성
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
    private String email;
    private String password;

    @Column(name ="name")
    private String userName;

    //@Lob
    @Transient
    private String introduction;

    @Enumerated(EnumType.STRING)
    private Authority authority;
}
