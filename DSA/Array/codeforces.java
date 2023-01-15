import java.util.*;
public class codeforces {
    static int sum (int[] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr= new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            Arrays.sort(arr);
           while(sum(arr) % 2 != 0) {
                arr[0] = arr[0] / 2;
                ans++;
           }
            System.out.println(ans);
        }


    }
}
