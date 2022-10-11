
import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
// time complexity is O(nlogn)
        int[] arr = new int[]{1,4,3,2};
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i = i+2) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
// time complexity is O(n)
    public static int partition(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        int[] freq = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - min ] = freq[arr[i] - min] + 1;
        }
        int ans = 0;
        int residue = 0;
        int trackFrequency = 0;
        for (int i = min; i <= max ; i++) {
            ans = ans + (freq[i - min] + 1) / 2 - residue;
            trackFrequency += (freq[i - min] + 1) / 2;
            residue = trackFrequency % 2;
            
        }
        return ans;
    }
}
