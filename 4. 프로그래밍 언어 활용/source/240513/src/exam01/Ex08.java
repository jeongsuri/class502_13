package exam01;

import java.io.*;

public class Ex08 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis(); //작업 시작 시간
        try (FileInputStream fis = new FileInputStream("ratings_train.xlsx");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("ratings_train3.xlsx");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while (bis.available() > 0) {
                bos.write(bis.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long etime = System.currentTimeMillis();
        System.out.printf("걸린시간 : %d%n", etime - stime);
    }
}
