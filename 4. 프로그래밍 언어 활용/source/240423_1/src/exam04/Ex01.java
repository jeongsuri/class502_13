package exam04;

public class Ex01 {
    public static void main(String[] args) {
        LoginService log = new LoginService();
        try{
            log.login("user01","123456");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
