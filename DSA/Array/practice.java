import java.util.*;

public class practice {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int[][] arr = new int[x][y];
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length; j++) {
            arr[i][j] = sc.nextInt();
          }
      }
      int top = 0;
      int bottom = arr.length - 1;
      int right = arr[0].length - 1;
      int left = 0;
      int count = (bottom+1) * (right+1);
      int direc = 1;
      while (left <= right && top <= bottom) {
        if(count > 0){
          if(direc == 1){
            for (int i = left; i <= right; i++){
                System.out.print(arr[top][i] + " ");
                count--;
            }
            top++;
            direc = 2;
          }
          if (count > 0) {
              if(direc == 2){
                  for (int i = top; i <= bottom; i++) {
                      System.out.print(arr[i][right] + " ");
                      count--;
                  }
                  right--;
                  direc = 3;
              }
          }
          if (count > 0) {
              if (direc == 3) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                    count--;
                }
                bottom--;
                direc = 4;
              }
            }
          }
          if(count > 0){
            if (direc == 4) {
              for (int i = bottom; i >= top; i--) {
                  System.out.print(arr[i][left] + " ");
                  count--;
              }
              left++;
              direc = 1;
            }
      }
      }


    }
  }
}
  
