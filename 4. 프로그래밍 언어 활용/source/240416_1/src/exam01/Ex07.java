package exam01;

import java.lang.reflect.Method;

public class Ex07 {
    public static void main(String[] args) {
        Class cls = Student.class; //class클래스 객체생성
        Method[] methods = cls.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }
    }
}
