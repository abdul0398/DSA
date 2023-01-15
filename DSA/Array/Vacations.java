import java.util.*;
public class Vacations {
    static int var = -1;
    static int solve(int[][] arr, int i, int x, int n, int[][] dp) {
        if (i >= n) {
            return 0;
        }
        if (dp[i][0] != -1) {
            return dp[i][0];
        } else if (dp[i][1] != -1) {
            return dp[i][1];
        } else if (dp[i][2] != -1) {
            return dp[i][2];
        }
        int op1 = Integer.MIN_VALUE, op2 = Integer.MIN_VALUE, op3 = Integer.MIN_VALUE;
        if (x != 0) {
            var = 0;
            op1 = dp[i][0] =  arr[i][0] + solve(arr, i + 1, 0, n, dp);
        }
        if (x != 1) {
            var = 1;
            op2 = dp[i][1] = arr[i][1] + solve(arr, i + 1, 1, n, dp);
        }
        if (x != 2) {
            var = 2;
            op3 = dp[i][2] = arr[i][2] + solve(arr, i + 1, 2, n, dp);
        }
        return dp[i][var] = Math.max(op1, Math.max(op2, op3));
    }
    static int solve1(int[][] arr, int i, int x, int n, int[][] dp) {
        if (i >= n) {
            return 0;
        }
        if (x != -1 && dp[i][x] != -1){
            return dp[i][x];
        }
        int ans = Integer.MIN_VALUE;
        for (int j = 0; j < 3; j++) {
            if(x != j){
                ans = Math.max(ans, arr[i][j] + solve(arr, i + 1, j, n, dp));
            }
        }
        if(x == -1){
            return ans;
        }else{
            return dp[i][x] = ans;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[100000][10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(arr, 0, -1, n, dp));
        sc.close();
    }
}
