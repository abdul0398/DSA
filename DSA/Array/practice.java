import java.util.*;
public class practice {
    static int solve(int[] taste , int[] calorie, int i, int tast, int cal, int k, int[] ans, int[] dp){
        if(i >= taste.length && tast == cal * k){
            ans[0] = Math.max(ans[0], tast);
            return tast;
        }
        if(i >= taste.length){
            return -1;
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        int x = solve(taste, calorie, i + 1,tast + taste[i], cal + calorie[i], k, ans, dp);
        int y = solve(taste,calorie, i + 1,tast,cal, k, ans, dp);
        return dp[i] = x == -1? y : x;
    }
    static class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;    
        }
    }
    static boolean solve(int row, int col, List<Pair> list, int i, int j, int[] ans, int moves, int[][] vis){
        if(i == row && j == col){
            ans[0] = Math.min(ans[0], moves);
            return false;
        }
        if(i >= row || j >= col || vis[i][j] == 1){
            return false;
        }
        vis[i][j] = 1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
        	while(t-- > 0){
                int row = sc.nextInt();
                int col  = sc.nextInt();
                int k = sc.nextInt();
                List<Pair> list = new ArrayList<>();
                for(int i = 0; i < k; i++){
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    list.add(new Pair(x,y));
                }
                int[][] vis = new int[row][col];
            }
        	        

        }
    }
}