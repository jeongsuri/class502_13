package question;
//구구단을 홀수 단만 출력하도록 프로그램을 만드시오.
public class Q04 {
    public static void main(String[] args) {
        for(int i=3; i<=9; i=i+2){
            for(int j =1; j<=9; j++){
                System.out.printf("%d x %d \n",i,j);
            }
        }
    }
}
