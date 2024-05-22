package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("a.txt");
        }catch(FileNotFoundException e){
        }
    }
}



