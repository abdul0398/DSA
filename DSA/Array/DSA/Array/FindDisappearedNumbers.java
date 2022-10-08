package DSA.Array;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
     Innerpractice(arr);   
    }
    public static void Innerpractice(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i]) - 1] > 0){
            nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) - 1] * -1;
        }
    }
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > 0) {
                System.out.println(j+1);
            }
        }
    }
}