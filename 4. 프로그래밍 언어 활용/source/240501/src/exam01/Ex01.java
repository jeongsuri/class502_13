package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        //변경불가 List, 추가, 수정, 삭제x
        List<String> names = Arrays.asList("name1","name2","name3");
        //names.remove(0);
        System.out.println(names);

        //변경이 필요한 경우느 List의 구현 클래스의 객체 생성시 생성자 매개변수로 대입
        List<String> names2 = new ArrayList<>(names);
        names2.remove(0);
        System.out.println(names2);
    }
}
