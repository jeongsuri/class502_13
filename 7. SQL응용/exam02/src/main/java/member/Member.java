package member;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PRIVATE) //기본생성자(PRIVATE로 접근제한)
@NoArgsConstructor() //기본생성자
public class Member {
    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;
}
