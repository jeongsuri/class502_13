package exam01;

import java.io.File;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/oreo/Desktop/fstudy/sub1/sub2/sub3/test1.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        ///Users/oreo/Desktop/fstudy/sub1/test1.txt
        File file2 = new File("/Users/oreo/Desktop/fstudy/sub1/sub2/sub3/../../../test1.txt");
        String aabsolutePath2 = file2.getAbsolutePath();
        System.out.println(aabsolutePath2);

        ///Users/oreo/Desktop/fstudy/test1.txt
        String canonicalPath = file2.getCanonicalPath();
        System.out.println(canonicalPath);

        System.out.println("getName() : " + file.getName());
        System.out.println("getPath() : " + file.getPath());
    }
}
