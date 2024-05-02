package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1","이름2","이름3");
        /*
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
         */
        //자바에서는 함수가 함수이기 때문에 지역내부에 인터페이스가 객체를 활용하여 메서드를 객체로.
        //
        names.forEach(s -> System.out.println(s));
    }
}
