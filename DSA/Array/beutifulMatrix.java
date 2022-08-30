package DSA.Array;
import java.util.*;
public class beutifulMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] coordinate = new int[5][5];
            for(int i = 0; i < 5; ++i){
                for(int j = 0; j < 5; ++j){
                    coordinate[i][j] = sc.nextInt();
                    
                }
            }
            for(int i = 0; i < 5; ++i){
                for(int j = 0; j < 5; ++j){
                    if(coordinate[i][j] == 1){
                        System.out.println(Math.abs((i + 1) - 3) + Math.abs((j+1) - 3));

                    }
            
                }
        }
    }
}
}