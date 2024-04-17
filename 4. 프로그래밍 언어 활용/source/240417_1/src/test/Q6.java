package test;

public class Q6 {
    public static void main(String[] args) {
        int j =1;
        for(int i=0; i<=9; i++){
            for(;j<=40;j++){
                System.out.printf("학생 %d, 방번호 %d\n",j,i);
                if(j%4==0){
                    j++;
                    break;
                }
            }
        }
    }
}
