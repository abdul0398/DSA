package DSA.Array;
import java.util.*;
public class isMonotonic {
    public static void main(String[] args) {
        
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        int incCount = 0;
        int decCount = 0;
        // That how you check if the array is sorted or not here (n-1) is used because we can't check i+1 when i is n-1 as index only are unto n-1
        for(int i = 0; i < n-1; ++i){
            if(arr[i] <= arr[i+1]){
                ++incCount;
            }
        }
        for(int i = 0; i < n-1; ++i){
            if(arr[i] >= arr[i+1]){
            ++decCount;
        }
        }
        if(incCount == arr.length -1 || decCount == arr.length - 1){
            System.out.print("true");
        }
        else{
            System.out.print("false");

        }
    }


}
}

