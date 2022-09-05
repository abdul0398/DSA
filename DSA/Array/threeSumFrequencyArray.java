/* QUESTION:
Given an array a of positive integers with length n,
determine if there exist three distinct indices i, j, k
 such that ai+aj+ak ends in the digit 3. */
package DSA.Array;

import java.util.Scanner;

public class threeSumFrequencyArray {
    public static void main(String[] args) {
// taking input from the user and creating frequency array of that input directly by using % to get the last digit of the input number.
// suppose the input array [12, 11, 13, 11, 12, 11, 10, 11, 12, 10, 12] so the frequency array will be [2, 4, 4, 1]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[10];
        for(int i = 0; i < n; ++i){
            int x = sc.nextInt() % 10;
            freq[x] = freq[x] + 1;
        }
/* here we are converting the frequency array to normal array so that each element only has max of 3 frequency, so that new array will be
         [0, 0, 1, 1, 1, 2, 2, 2, 3]*/      
        int[] arr = new int[30];
        int k = 0;
        for(int i = 0; i < 10; ++i){
            for(int j = 0; j < Math.min(3,freq[i]); ++j){
                arr[k] = i;
                ++k;
            }
        }
// now we run loops and check each three pairs to find the pairs which will satify the given condition.
        Boolean flag = false;
        for(int i = 0; i < arr.length; ++i){
            for(int j = i + 1 ; j < arr.length; ++j ){
                for(int m = j + 1; m < arr.length; ++m){
                    if(arr[i] + arr[j] + arr[k] == 3){
                        flag = true;
                    }
                }


            }
        }
        if(flag == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}



