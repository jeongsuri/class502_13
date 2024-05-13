package exam02;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("년 월 입력 : ");
            String input = sc.nextLine();

            if(input.equals("exit")){
                System.out.println("종료 합니다.");
                break;
            }
            try{
                String[] data = input.split("\\s+");
                int year = Integer.parseInt(data[0]);
                int month = Integer.parseInt(data[1]);
                System.out.printf("--------- %d년 %d월 --------- \n",year, month);
                System.out.println("일\t월\t화\t수\t목\t금\t토");
                getCalendar(year, month);
            }catch(Exception e){ // 숫자 형식 오류가 발생한 경우
                System.out.println("입력형식이 잘못되었습니다. 입력 예) 2024 5");
            }
        }
    }

    public static void getCalendar(int year, int month){
        LocalDate startDate = LocalDate.of(year,month,1);
        int startYoil = startDate.getDayOfWeek().getValue() % 7; //시작요일

        LocalDate endDate = startDate.plusMonths(1).minusDays(1);//해당 월에 마지막 일

        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 1 ; i<=endDate.getDayOfMonth(); i++,startYoil++){
            map.put(startYoil+1,i);
        }

        for (int i=1;i<=map.size() + startDate.getDayOfWeek().getValue(); i++){
            if(map.get(i)==null) {
                System.out.print("    ");
            } else{
                if(i % 7 == 1 && i > 1){
                    System.out.println();
                }
                System.out.print(String.format("%2d",map.get(i)));
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
