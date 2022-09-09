package DSA.Array;

import java.util.Scanner;

/**
 * rotatingArray
 */
public class rotatingArray {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i < n; ++i){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < n ; ++i){
                if(Math.abs(arr.length - i) <= n){
                    arr[i+n] = arr[i];
                }else if(Math.abs(arr.length - i) > n){
                    arr[i + n] = arr[i];
                }
            }
            System.out.print(arr[0]);
            





        }
    }
}