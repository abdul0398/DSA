package DSA.Array;

public class KthLargestElementinanArray {
    
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int index = prime(arr,4);
        System.out.println(index);
    }

    public static int prime(int nums[], int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
                max = Math.max(nums[i],max);
                min = Math.min(nums[i],min);
        }
        int[] freq = new int[max - min + 1];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i] - min] += 1;
        }
        int ans = 0;
        for(int i = max; i >= min; i--){
            if(freq[i - min] >= 1){
                for(int j = 0; j < freq[i - min]; j++){
                    k--;
                    if(k == 0){
                        ans = i;
                        
                    } 
                }
            }else{
                continue;
            }
        }
        return ans;
        
                
    }
}
