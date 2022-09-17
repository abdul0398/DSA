package DSA.Array.TwoPointers;

import java.util.*;

public class impVasyaAndString {
    public static void main(String[] args) {
        int ans1 = solve('a');
        int ans2 = solve('b');

        System.out.println(Math.max(ans1,ans2));
       
    }
    public static int solve(char X){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.nextLine();
            int j = 0;
            int count = 0;
            int ans = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++ ){
                if(s.charAt(i) != X){
                    count++;
                }
                while(count > k){
                    if(s.charAt(j) != X){
                        count--;    
                    }
                    j++;
                }
                if(i - j + 1 > ans){
                    ans = i - j + 1;
                }

            }
            return ans;
        }
    }
}
