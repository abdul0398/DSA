package DSA.Array.BinarySearch;
// important formula is (mid*(mid+1))/2
// T.C = O(logn)
public class arrangeCoin {
    public static int arrangeCoinn(int n){
        long start = 0;
        long end = n;
        long mid = start + (end - start) / 2;
        long ans = -1;
        while (start <= end){
            if(n >= (mid*(mid+1))/2){
                start = mid + 1;
                ans = mid;
            }else if(n < (mid*(mid+1))/2){
                end = mid - 1;
                
            }
            mid = start + (end - start) / 2;
            
        }
        return (int)ans;

    }
}
