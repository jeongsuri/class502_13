package exam01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
        //HashSet<String> names = new HashSet<>();

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.compareTo(o2); //오름차순
                //return o2.compareTo(o1); //내림차순
                // return o1.compareTo(o2) * -1; //내림차순
            }
        };
        //Set<String> names = new TreeSet<>(comp); //매개변수에 위에서 오버라이딩한 Comparator를 넣게 되면 해당 기준으로 정렬된다.
        //String에서는 내부에 Comparable이 정의 되어있기때문에 정렬기준으로 정렬이된다.
        //또한 내부에서 final로 정의되어있기때문에 외부에서 재정의가 불가능하기 때문에,
        //항상 오름차순으로만 정렬된다.
        Set<String> names = new TreeSet<>(Comparator.reverseOrder());
        names.add("이름1");
        names.add("이름2");
        names.add("이름4");
        names.add("이름3");
        names.add("이름5");
        System.out.println(names); //names.toString()

    }
}
