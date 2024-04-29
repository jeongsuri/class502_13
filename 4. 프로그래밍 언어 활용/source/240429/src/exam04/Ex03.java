package exam04;

import java.util.Vector;

public class Ex03 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<String>(3);
        System.out.println(names.capacity()); //기본값은 10
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름3");
        System.out.println(names.capacity()); //공간이 넘쳤기 때문에 크기가 두배로 증가.
    }
}
