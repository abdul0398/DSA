import java.util.*;
public class bc {
    static boolean solve(int[] list, int p){
        for (int i = list.length - 1; i > 0; i--) {
            if (list[i] > p) {
                list[i - 1] =list[i - 1] - p;  
            }
        }
        if(list[0] > p){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
        	while(t-- > 0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                int max = 0;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                    max = Math.max(max,arr[i]);
                }
                int ans = max;
                int low = 0;
                int high = max;
                while (low <= high) {
                    int mid = (low+high) / 2;
                    if(solve(arr, mid)){
                        high = mid - 1;
                        ans = mid;
                    }else{
                        low = mid + 1;
                    }
                }
                System.out.println(ans);
                
            }
        }
    }
}