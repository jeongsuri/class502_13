package org.choongang.member.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
//@Table
public class Member {
    @Id //기본키 설정
    @Column("ID")
    private Long seq;
    private String email;

    @JsonIgnore
    private String password;
    private String userName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime regDt;
}
