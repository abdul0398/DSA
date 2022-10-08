package BinarySearch;

public class binarySearch {


    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,7,9,10,15,17,};
        int index = binary(array,9,10);
        System.out.println(index);
    }

    public static int binary(int arr[], int size, int key ){
        int start = 0;
        int end = size -1;
        int mid = start + (end - start) / 2;
        while(end >= start){
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                end = mid - 1;
            }else if(arr[mid] < key){
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;

        }
    }
