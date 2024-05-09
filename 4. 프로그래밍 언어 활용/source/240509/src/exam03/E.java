package exam03;

import java.text.DecimalFormat;


public class E {
    public static void main(String[] args) {
        double num1 = 1000000000.123;

        DecimalFormat df = new DecimalFormat("0,000.0000");
        String num1Str = df.format(num1);
        System.out.println(num1Str); //>1,000,000,000.1230

        DecimalFormat df2 = new DecimalFormat("#,###.####");
        num1Str = df2.format(num1);
        System.out.println(num1Str);
    }
}