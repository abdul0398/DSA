package DSA.Array;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,3,2};
        Arrays.sort(arr);
         System.out.println(arr[1]);
        int sum = 0;
        for (int i = 0; i < arr.length; i = i+2) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}