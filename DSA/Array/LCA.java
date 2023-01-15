import java.util.*;
class LCA{
    // by using recurrsion only;
    // static int solve(String s, String t, int i, int j){
    //     if(i == s.length() || j == t.length()){
    //         return 0;
    //     }
    //     int option1 = Integer.MAX_VALUE;
    //     int option2 = Integer.MAX_VALUE;
    //     if(s.charAt(i) == t.charAt(j)){
    //         return option1 = 1 + solve(s, t, i + 1, j + 1); 
    //     }else{
    //         return option2 = Math.max(solve(s, t, i + 1, j), solve(s, t, i, j + 1));
    //     }
    // }
    //using dp
    static int solvedp(String s, String t, int i, int j,int[][] dp){
        if(i >= s.length() || j >= t.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j] = 1 + solvedp(s, t, i + 1, j + 1,dp); 
        }else{
            return dp[i][j] = Math.max(solvedp(s, t, i + 1, j,dp), solvedp(s, t, i, j + 1,dp));
        }
    }
    static String getLca(int[][] dp, String s, String t, int len){
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (len > 0) {
            if(s.charAt(i) == t.charAt(j)){
                sb.append(s.charAt(i));
                len--;
                i++;
                j++;
            }else if(dp[i][j + 1] > dp[i + 1][j]){
                j++;
            }else{
                i++;
            }
        }
        return sb.toString();
    }
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int[][] dp = new int[3000][3000];
    for (int i = 0; i < dp.length; i++) {
        for (int j = 0; j < dp[0].length; j++) {
            dp[i][j] = -1;
        }
    }
    System.out.println(getLca(dp, s, t, solvedp(s, t, 0, 0, dp)));    
    sc.close();
    }
}

