package DSA.Array;
import java.util.*;
public class youngPhysicists {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] coordinate = new int[n][3];
            int a = 0;
            int b = 0;
            int c = 0;
            for(int i = 0;i < n;++i){
                for (int k = 0; k < 3; ++k) {
                    coordinate[i][k] = sc.nextInt();
                    if(k == 0){
                        a += coordinate[i][k];
                    }else if( k == 1){
                        b += coordinate[i][k];
                    }else{
                        c += coordinate[i][k];
                    }
                    }
                }
                if(a == 0 && b == 0 && c ==0){
                    System.out.print("YES");
                }else{
                    System.out.print("NO");

                }
            }
 
 
    }
}
