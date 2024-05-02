package exam01;

import java.util.function.Function;

public class Ex05 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length();
        Function<Integer, Integer> func2 = x -> x * x;
        Function<String, Integer> func3 = func1.andThen(func2); //fun1과 fun2를 결합 fun1을 먼저 수행하고 fun2
        Function<String, Integer> func4 = func2.compose(func1); //fun1과 fun2를 결합
        int len1 = func3.apply("가나다");
        int len2 = func4.apply("가나다라마");
        System.out.println(len1);
        System.out.println(len2);

    }
}
