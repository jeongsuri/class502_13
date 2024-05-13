package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class E {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")){
            byte[] buffer = new byte[5];
            while(fis.available() > 0){
                int ch = fis.read(buffer);  //ch -> 읽어온 바이트수
                //버퍼는 기존값을 삭제하고 담지 않고 삭제는 생략하고 덮어씌운다.
                //버퍼는 성능을 위해 사용하기 때문에 삭제를 생략하여 성능을 증가시킨다.
                //그렇기 때문에 마지막은 중복이 될 수 있다.
                for(int i = 0 ; i< ch; i++){
                    System.out.print((char)buffer[i]);
                }
                System.out.println();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
