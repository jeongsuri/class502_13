package question;
//구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요
public class Q05
{
    public static void main(String[] args) {
        for(int i=2;i<=9;i++){
            for(int j=2;j<=9;j++){
                if(i<=j){
                    System.out.printf("%d x %d = %d\n",i,j,i*j);
                }
            }
        }
    }
}
