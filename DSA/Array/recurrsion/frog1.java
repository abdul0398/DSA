package DSA.Array.recurrsion;

public class frog1 {
    public static void main(String[] args) {
        int arr[] = {10, 30, 40, 20};
        int n = arr.length - 1;
        System.out.println(frog(arr,0,n));

    }


    static int frog(int arr[], int i, int n){
        if(i >= n){
            return 0;
        }
        int op1 = Math.abs(arr[i] - arr[i + 1]) + frog(arr, i+1, n);
        int op2 = Integer.MAX_VALUE;
        if(i + 2 <= n){
        op2 = Math.abs(arr[i] - arr[i+2]) + frog(arr, i + 2, n);
        }
        return Math.min(op1, op2);
    
    }
    
}
