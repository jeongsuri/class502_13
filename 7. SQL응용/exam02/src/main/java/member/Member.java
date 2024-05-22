package member;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PRIVATE) //기본생성자(PRIVATE로 접근제한)
@NoArgsConstructor() //기본생성자
@RequiredArgsConstructor
public class Member {
    @NonNull
    private String userId;

    @NonNull
    private String userNm;
    private String email;

    @ToString.Exclude
    private LocalDateTime regDt; //toString 에 배제된다.
}
