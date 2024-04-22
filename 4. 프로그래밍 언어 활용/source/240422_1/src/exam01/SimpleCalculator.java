package exam01;

public class SimpleCalculator extends Calculator {
    public  SimpleCalculator(){
        super();
    }

    public int add(int num1, int num2){
        return num1+num2;
    }


    //public void commonMethod() { //final로 인해 재정의 불가
    //}
}
