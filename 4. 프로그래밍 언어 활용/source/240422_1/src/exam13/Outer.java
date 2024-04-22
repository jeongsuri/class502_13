package exam13;

public class Outer {
    public Calculator method(int num3){ //반환값을 Calculator자료형으로 반환
        Calculator cal = new Calculator(){
            public int add(int num1, int num2) {
                // num3 = 100; //지역변수의 상수화 final int num3
                return num1 + num2 + num3;
            }
        };
        System.out.println("cal:"+cal);
        //int result = cal.add(10,20); 이런식으로 내부에 정의하면 일회용으로만 가능하다.
        //System.out.println(result);
        return cal; //cal객체를 반환시킴, cal객체의 주소값을 외부에 리턴함으로써 외부에서도 사용가능하게한다.
    }
}
