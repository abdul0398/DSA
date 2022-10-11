package BinarySearch;

public class findPeakMountain {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,2};
        int max = linear(arr);
        System.out.println(max);
    }
    public static int linear(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while(start < end){
            if(arr[mid] < arr[mid+1]){
                start = mid +1;
            }else{
                end = mid;
            }
            mid = start + (end - start) / 2;
        } 
        return end;
    }
}


