package DSA.Array;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,3,2};
        int digit = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                 digit = arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1] = digit;
            }
         }
         System.out.println(arr[1]);
        int sum = 0;
        for (int i = 0; i < arr.length; i = i+2) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}