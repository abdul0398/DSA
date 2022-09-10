package DSA.Array.BinarySearch;

public class firstAndLastOcuurence {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,3,4,6,7};
        int firstIndex = firstOccurence(7, 2, array);
        int lastIndex =lastOccurence(array, 7, 2);
        System.out.println("first occurence is --> " + firstIndex + "\nlast occurence is --> " + lastIndex);
    }

    public static int firstOccurence(int size, int key, int arr[]) {

            int start = 0;
            int end = size - 1;
            int mid = start + (end - start) / 2;
            int ans = -1;
            while (start <= end ) {
                if (arr[mid] == key) {
                    ans = mid;
                    end = mid -1;

                } else if (arr[mid] < key) {
                    start = mid + 1;

                } else if (arr[mid] > key) {
                    end = mid - 1;
                }
                mid = start + (end - start) / 2;
                
            }
            if (ans != 0){
                return ans;
            }else{
                return -1;
            }

        }
        public static int lastOccurence(int arr[], int size, int key ){
            int start = 0;
            int end = size -1;
            int ans = -1;
            int mid = start + (end - start) / 2;
            while(start <= end){
                if(arr[mid] == key){
                    ans = mid;
                    start = mid + 1;
                }else if(arr[mid] > key){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                mid = start + (end - start) / 2;
            }
            if(ans != 0){
                return ans;
            }else{
                return -1;
            }

       
    }
}


