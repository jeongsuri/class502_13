package exam01;

import java.util.StringTokenizer;

public class Ex04 {
    public static void main(String[] args) {
        String fruits = "Apple#Orange,Melon#Banana";
        StringTokenizer st = new StringTokenizer(fruits,"#,_+");
        while(st.hasMoreElements()){
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
