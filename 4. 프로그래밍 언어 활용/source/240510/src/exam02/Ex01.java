package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")){
            int ch = fis.read(); //1byte씩 읽어옴 A
            System.out.println((char)ch);

            ch = fis.read();//B를 읽어옴
            System.out.println((char)ch);

            ch = fis.read(); //C를 읽어옴
            System.out.println((char)ch);

            ch = fis.read(); //D를 읽어옴
            System.out.println((char)ch);

            ch = fis.read(); //E를 읽어옴
            System.out.println((char)ch);

            ch = fis.read(); // 다읽고나면 -1을 읽어옴
            System.out.println(ch);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
