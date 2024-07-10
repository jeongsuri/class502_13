package member.validators;

import global.exceptions.BadRequestException;
import global.validaotrs.RequiredValidator;
import global.validaotrs.Validator;
import lombok.RequiredArgsConstructor;
import mappers.member.MemberMapper;
import member.controllers.RequestJoin;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {

    private final MemberMapper mapper;

    @Override
    public void check(RequestJoin form) {
        /**
         * 1. 필수 항목 검증(email, password, confirmPassword, userName, agree)
         * 2. 이메일 중복 여부 검증(회원이 가입되어 있는지 체크)
         * 3. 비밀번호 자리수 체크 ( 8자리 이상 )
         * 4. 비밀번호 + 비밀번호확인 일치 여부
         */

        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getPasswordConfirm();
        String userName = form.getUserName();
        boolean agree = form.isAgree();

        // 1. 필수 항목 검증(email, password, confirmPassword, userName, agree)
        checkRequired(email,new BadRequestException("이메일을 입력하세요."));
        checkRequired(password,new BadRequestException("비밀번호를 입력하세요."));
        checkRequired(confirmPassword,new BadRequestException("비밀번호를 확인하세요."));
        checkRequired(userName,new BadRequestException("회원명을 입력하세요."));
        checkTrue(agree,new BadRequestException("약관에 동의하세요."));

        //2. 이메일 중복 여부 검증(회원이 가입되어 있는지 체크)
        checkTrue(mapper.exists(email) > 0L , new BadRequestException("이미 가입된 이메일 입니다."));

        //3. 비밀번호 자리수 체크 ( 8자리 이상 )
        checkTrue(password.length() >= 8, new BadRequestException("비밀번호는 8자리 이상 입력하세요"));

        //4. 비밀번호 + 비밀번호확인 일치 여부
        checkTrue(password.equals(confirmPassword), new BadRequestException("비밀번호가 일치하지 않습니다."));


    }
}