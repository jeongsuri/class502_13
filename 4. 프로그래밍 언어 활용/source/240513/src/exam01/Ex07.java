package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis(); //작업 시작 시간
        try(FileInputStream fis = new FileInputStream("ratings_train.xlsx");
        FileOutputStream fos = new FileOutputStream("ratings_train2.xlsx")){
            while(fis.available()>0) {
                fos.write(fis.read());
            }

        } catch(IOException e){
            e.printStackTrace();
        }

        long etime = System.currentTimeMillis();
        System.out.printf("걸린시간 : %d%n", etime - stime);
    }
}
