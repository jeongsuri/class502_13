package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("a.txt");
            System.out.println("파일작업");
        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }finally {
            System.out.println("finally");
            if (fis != null){
                try{
                    fis.close();
                } catch (IOException e)
                {

                }
            }
            System.out.println("자원해제완료");

        }
    }
}
