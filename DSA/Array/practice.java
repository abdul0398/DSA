package DSA.Array;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        int[] arr = {88,66,55,44,22};
        int temp = 0;
// bubble sort 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1- i; j++) {
                if (arr[j] > arr[j + 1]){
                   temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                }else{
                    continue;
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }


    }
    
}