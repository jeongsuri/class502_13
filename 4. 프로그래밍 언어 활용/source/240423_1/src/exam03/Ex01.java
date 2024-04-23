package exam03;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Resource res = new Resource();
        Resource2 res2 = new Resource2();
        try (res; res2) {
            //res가 AutoCloasable 인터페이스 구현 객체인지 체크 → close()메서드 자동호출
            //자동해제과정
            //AutoCloseable auto = res;
            //auto.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
