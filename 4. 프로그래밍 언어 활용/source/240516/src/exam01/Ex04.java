package exam01;

import java.io.File;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        //File file = new File("/Users/oreo/Desktop/test1.txt");
        //file.createNewFile();
        File dir = new File("/Users/oreo/Desktop/fstudy");
        File file = new File(dir,"test1.txt");
        //exists() : 파일 또는 디렉토리 존재 유무 체크
        if(!dir.exists()) { //디렉토리가 없는 경우
            dir.mkdir(); //디렉토리생성
            System.out.println("디렉토리생성");
        }
        file.createNewFile();
    }
}
