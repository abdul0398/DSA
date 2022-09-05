package DSA.Array;
import java.util.*;
public class frequencyArray {
    public static void main(String[] args) {
    try (// Taking input from the user 
        Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
   //creating new array
            int[] arr = new int[n];
   //initializing maxNo with minimum value possible so that when iterate through first number it becomes max 
            int maxNo = Integer.MIN_VALUE;
   //initializing minNo with max value possible so that when iterate through first number it becomes min 
            int minNo = Integer.MAX_VALUE;
   // taking inputs of array elements using for loop
            for(int i = 0;i < n;i++) {
                arr[i] = sc.nextInt();
            // choosing max number from input of the user that are given to the array 
                maxNo = Math.max(maxNo, arr[i]);
            // choosing min number from input of the user that are given to the array
                minNo = Math.min(minNo, arr[i]);
            }

// create new freq array with a lenth of maxNo in the array + minNO and +1 for zero
            int[] freq = new int[maxNo + 1 - minNo];
/*  making each element of the input array as a index of freq array and add one to the element of 
    frequency array each time an element is present in an input array*/
            for(int i = 0; i < n;i++){
                freq[arr[i] - minNo ] = freq[arr[i] - minNo] + 1;
            }
            //now printing the freqency of the elements of input array
            for(int i = 0; i < (maxNo - minNo +1); i++){
                if(freq[i] != 0){
                System.out.println((i + minNo) + " --> " + freq[i]);
            }
   }
        }
    }

}
