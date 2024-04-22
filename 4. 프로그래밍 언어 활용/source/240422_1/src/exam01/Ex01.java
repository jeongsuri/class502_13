package exam01;

public class Ex01 {
   public static void main(String[] args) {
      Calculator cal = new SimpleCalculator(); //업캐스팅
      //SimpleCalculator cal = new SimpleCalculator();

      int result1 = cal.add(10,20);
      System.out.println(result1);

      System.out.println(cal.num);
   }
}
