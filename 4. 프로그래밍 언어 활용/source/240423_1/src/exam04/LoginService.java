package exam04;

public class LoginService {
    public void login(String userId, String userPW) throws UserIdException, UserPwException {
        //userID = user01, userPw = 123456
        try {
            if (!userId.equals("user01")) {
                throw new UserIdException("아이디가 일치하지않음");
            }

            if (!userPW.equals("123456")) {
                throw new UserPwException("비밀번호가 일치하지않음");

            }
            System.out.println("로그인성공");
        }catch (UserIdException | UserPwException e){
            System.out.println(e.getMessage());
        }
    }
}
