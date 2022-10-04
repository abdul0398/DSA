package DSA;
import java.util.*;
public class gambling {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            long n =sc.nextLong();
            long[] aa = new long[(int)n];
            long[] bb = new long[(int)n];
            for(int i = 0; i < n; i++){
                aa[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                bb[i] = sc.nextInt();
            }
            Arrays.sort(aa);
            Arrays.sort(bb);
              long scoreA = 0;
              long scoreB = 0;
              long a = n - 1, b  = n - 1;
            while(a >= 0 || b >= 0){
                if(a >= 0){
                    if(b >= 0){
                      if(aa[(int)a] > bb[(int)b]){
                        scoreA += aa[(int)a];
                        a--;
                      }else{
                        b--;
                      }
                    }else{
                      scoreA += aa[(int)a];
                      a--;
                      
                    }
                }else{
                  b--;
                }
                if(b >= 0){
                  if(a >= 0){
                    if(aa[(int)a] > bb[(int)b]){
                      a--;
                    }else{
                      scoreB += bb[(int)b];
                        b--;
                    }
                  }else{
                    scoreB += bb[(int)b];
                    b--;
                  }
                }else{
                  a--;
                }
              
                
              }
            System.out.print(scoreA - scoreB);
        }
    }
}
