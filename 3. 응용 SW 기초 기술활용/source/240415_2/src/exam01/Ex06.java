package exam01;

public class Ex06 {
    public static void main(String[] args) {
        int[][] nums = {{10, 20, 30},{40,50,60}};
        System.out.println(nums);
        System.out.println(nums.length); //>2(행의갯수)
        System.out.println(nums[0].length);//>3(열의갯수)
        System.out.println(nums[1].length);//>3(열의갯수)

        for(int i = 0; i < nums.length; i++){ //행
            for(int j = 0; j < nums[i].length; j++){
                System.out.println(nums[i][j]); //i행,j열
            }
        }
    }
}
