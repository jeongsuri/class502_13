
package exam01;

public class test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums1 = new int[4];
        for(int i = nums.length-1, j =0;i>=0;i--,j++){
            nums1[j]=nums[i];
        }
        for(int j =0 ;j<=3;j++){
            System.out.println(nums1[j]);
        }
    }
}

