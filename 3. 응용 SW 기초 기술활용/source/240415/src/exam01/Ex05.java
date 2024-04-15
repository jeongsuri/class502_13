package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int total = 0, num =0; // 초기화ㅣ
        while(num <= 100){ //조건식 - 반복을 멈추는 조건
            total += num; // total = total + num;
            num++; // num = num + 1
        }
        System.out.println("합계 : " + total);
    }
}
