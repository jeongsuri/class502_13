package exam13;

public class Ex01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer);
        Calculator cal = outer.method(30);
        //자료형이 Caluculator인 이유는 outer.mothod가 Calculator자료형인 cal을 반환하기떄문이다. 
        //참조가 되어 있지않으면 가비지 콜랙터가 제거
        // 값을 할당하면 제거가 되지않음.
        System.out.println(cal);
        int result = cal.add(10,20);
        System.out.println(result);
        int result2 = cal.add(20,30);
        //매개변수인 num3은 메서드가 종료될시 초기화가 되어야할텐데 초기화되지않음
        // 그이유는 num3이 상수화되었기 때문이다. 이유(제거되지않기 위해서)
        System.out.println(result2);
    }
}
