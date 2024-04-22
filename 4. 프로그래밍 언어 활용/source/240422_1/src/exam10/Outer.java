package exam10;

public class Outer {

    int num1 = 10;

    class Inner{

        int num2 = 20;
        static int num3 =30;
        public void mothod(){
            System.out.println("인스턴스 내부 클래스에서 호출");
            System.out.printf("num1 + num2 =  %d",num1+num2);

        }
    }
}
