package DSA.Array;
import java.util.*;
public class practice {
    public static int main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = {12,34,67,90};
		int sum = 0;
		for(int i = 0; i < n; i++){
            sum += arr[i];
		}
		int start = 0;
		int end = sum;
		int mid = start + (end - start) / 2;
		int ans = 0;
		while(start <= end){
			if(possible(mid,arr,m)){
				end = mid - 1;
				ans = mid;
			}else{
				start = mid + 1;
			}
		}
		return ans;
    }
	static boolean possible(int mid, int arr[], int m){
		int sum = 0;
		int numberOfstudents = 0;
		for(int i = 0; i < arr.length; i++){
			if(sum + arr[i] <= mid){
				sum += arr[i];
			}else{
				numberOfstudents++;
				if(numberOfstudents > m || arr[i] > mid){
					return false;
				}else{
					sum = arr[i];
				}
			}
		}
		return true;
	}
	}
