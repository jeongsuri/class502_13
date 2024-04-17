package test;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = {21,22,30,11,99,31};
        int[] nums1 = new int[6];
        for(int i = nums.length-1, j =0;i>=0;i--,j++){
            nums1[j]=nums[i];
        }
        for(int i =0 ;i<=5;i++){
            nums[i]=nums1[i];
            System.out.println(nums[i]);
        }
    }
}
