package DSA.Array.recurrsion;

/*There are N stones, numbered 1,2,…,N. For each i (1≤i≤N), the height of Stone i is hi
There is a frog who is initially on Stone 1. He will repeat the 
following action some number of times to reach Stone N:

If the frog is currently on Stone i, jump to Stone i+1 or Stone i+2. Here, a cost of ∣hi−hj∣ is 
incurred, where j is the stone to land on.
Find the minimum possible total cost incurred before the frog reaches Stone N. 
 */



public class frog {
    public static void main(String[] args) {
        int arr[] = {10, 30, 40, 20};
        int n = arr.length - 1;
        System.out.println(frog2(arr,0,n,3));

    }


    // static int frog1(int arr[], int i, int n){
    //     if(i >= n){
    //         return 0;
    //     }
    //     int op1 = Math.abs(arr[i] - arr[i + 1]) + frog(arr, i+1, n);
    //     int op2 = Integer.MAX_VALUE;
    //     if(i + 2 <= n){
    //     op2 = Math.abs(arr[i] - arr[i+2]) + frog(arr, i + 2, n);
    //     }
    //     return Math.min(op1, op2);
    
    // }


/* 
There are N stones, numbered 1,2,…,N. For each i (1≤i≤N), the height of Stone i is hi
There is a frog who is initially on Stone 1. He will repeat the following action some number of times to reach Stone N:
If the frog is currently on Stone i, jump to one of the following: Stone i+1,i+2,…,i+K. Here, a cost of ∣hi−hj∣ is incurred, where j is the stone to land on.
Find the minimum possible total cost incurred before the frog reaches Stone N.
*/


static int frog2(int arr[], int i, int n, int k){
        if(i >= n){
            return 0;

        }

    int ans = Integer.MAX_VALUE;
    for (int j = 1; j < k; j++){
        if(i + j <= n - j){
        ans = Math.min(ans , arr[i] - arr[i + j]) + frog2(arr,i + j, n , k);
        }

    }
    return ans;

}
    
}
