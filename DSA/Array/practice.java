import java.util.*;
public class practice {
    static boolean check(int capacity,int[] weights,int minDays){
        int sum = 0;
        int days = 1;
        for(int i = 0; i < weights.length; i++){
            if(sum + weights[i] <= capacity){
                sum += weights[i];
            }else{
                days++;
                sum = weights[i];
            }
            if(days > minDays){
                return false;
            }
        }
        return true;

    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = 10000000;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(check(mid,weights,days)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
	public static void main(String[] args) {
	System.out.println(check(4,new int[]{1,2,3,1,1}, 4));
	}
}