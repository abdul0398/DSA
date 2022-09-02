package DSA.Array;

import java.util.Scanner;

public class sortArray{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] temp = new int[n];
            for(int i = 0; i < n; ++i){
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i < n -1; ++i){
                if(arr[i+1] < arr[i]){
                    temp[n] = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp[n];

                }
            }
            for(int i = 0; i < n; ++i){
                System.out.println(arr[i]);
            }




        }
        
    }
}
