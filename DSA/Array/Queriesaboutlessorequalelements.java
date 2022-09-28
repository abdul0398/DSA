package DSA.Array;
import java.util.*;
public class Queriesaboutlessorequalelements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int[] arra = new int[a];
            int b = sc.nextInt();
            int[] arrb = new int[b];
            for (int i = 0; i < a ; i++){
                arra[i] = sc.nextInt();
            }
            for (int i = 0; i < b; i++) {
                arrb[i] = sc.nextInt();
            }
            Arrays.sort(arra);
            for (int i = 0; i < b; i++) {
                int start = 0;
                int end = a - 1;
                int mid = start + (end - start) / 2;
                int ans = 0;
                while(start <= end){
                    if(arra[mid] <= arrb[i] ){
                        start = mid + 1;

                    }else if(arra[mid] > arrb[i]){
                        end = mid -1;
                    }
                    mid = start + (end - start) / 2;
                }
                ans = start;
                System.out.println(ans);
                
            }



        }
    }
}
