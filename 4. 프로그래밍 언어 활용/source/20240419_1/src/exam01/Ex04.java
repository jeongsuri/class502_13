package exam01;

public class Ex04 {
    public static void main(String[] args) {
        A ad = new D();
        A ac = new C();
        //C c = ad; 오류발생
        //C c = ac; 오류발생
        //C c = (C)ad; 강제형변환도 오류발생
        if(ad instanceof C){
            C c = (C) ad;
        }
        if(ac instanceof C){
            C c = (C)ac;
        }
    }
}
