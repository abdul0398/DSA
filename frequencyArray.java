import java.util.*;
public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxNo = Integer.MIN_VALUE;
        int minNo = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
            maxNo = Math.max(maxNo, arr[i]);
            minNo = Math.min(minNo, arr[i]);
        }


        int[] freq = new int[maxNo + 1 - minNo];
        for(int i = 0; i < n;i++){
            freq[arr[i] - minNo ] = freq[arr[i] - minNo] + 1;
        }
        for(int i = 0; i < (maxNo - minNo +1); i++){
            System.out.println((i + minNo) + " --> " + freq[i]);
        }
    }

}
