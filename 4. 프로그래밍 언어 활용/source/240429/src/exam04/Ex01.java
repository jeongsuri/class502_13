package exam04;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1"); //추가
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");
        /*
        for( int i=0; i<names.size(); i++){
            //삭제가되면 위치를 변경할수가 없기 때문에 새로운 객체로 재형성됨
            //제거를 역순으로 하는것이 제일 좋다.
            names.remove(i);
        }
         */

        for(int i = names.size() -1 ; i>=0 ; i--){ //역순으로 제거함으로써 객체를 재형성하지 않아도된다.
            names.remove(i);
        }

        for(int i = 0 ; i < names.size();i++){ //조회
            System.out.println(names.get(i));
        }

    }
}
