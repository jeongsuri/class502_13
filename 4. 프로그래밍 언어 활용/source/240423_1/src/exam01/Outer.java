package exam01;

public class Outer {
    private Calculator cal2 = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };
    public Calculator method(int num3){ // 반환값을 Calculator 참조자료형으로 변환
        Calculator cal = new Calculator() {//지역변수(스택) = 객체 생성(힙에저장)
            public int add(int num1, int num2){
                return num1 + num2 +num3;
            }
        };
        System.out.println("지역변수" + cal);
        return cal;
    }

    public Calculator method1(int num3){
        return new Calculator() {
            public int add(int num1, int num2) {
                return num1+num2+num3;
            }
        };
    }
}
