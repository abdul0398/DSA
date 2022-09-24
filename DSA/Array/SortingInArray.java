package DSA.Array;

// All sorting algorithm in Arrays.
public class SortingInArray {
    public static void main(String[] args) {
        int[] arr = {8,6,5,4,2};
        //int temp = 0;
// bubble sort 
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = 0; j < arr.length - 1- i; j++) {
        //         if (arr[j] > arr[j + 1]){
        //            temp = arr[j];
        //            arr[j] = arr[j + 1];
        //            arr[j + 1] = temp;
        //         }else{
        //             continue;
        //         }
        //     }
            
        // }
// selection sort
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int min = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if(arr[min] > arr[j]){
        //             min = j;
        //         }
        //         int temp1 = arr[min];
        //         arr[min] = arr[i];
        //         arr[i] = temp1;   
        //     }
        // }
        // System.out.println(arr[4]);


// Insertion sort  8,6,5,4,2
            // for (int i = 1; i < arr.length; i++) {
            //     int temp = arr[i];
            //     int j = i - 1;
            //     for (; j >=0 ; j--) {
            //         if(temp < arr[j]){
            //             arr[j + 1] = arr[j];

            //         }else{
            //             break;
            //         }
            //     }
            //     arr[j+1] = temp;
            // }
// Insertion sort using while loop;
            // for (int i = 1; i < arr.length; i++) {
            //     int tempp = arr[i];
            //     int j = i - 1;
            //     while( j >= 0 ){
            //         if(arr[j] > tempp){
            //             arr[j+1] = arr[j];

            //         }else{
            //             break;
            //         }
            //         j--;
            //     }
            //     arr[j+1] = tempp;

            // }
            // System.out.println(arr[4]);
     }

}
