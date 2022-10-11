import java.util.*;

public class wave2dprint {
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
            int right = arr.length - 1;
            int top = 0;
            int left = 0;
            int bottom = arr.length - 1;
            int count = (right + 1) * (bottom + 1);
            while (top <= bottom) {
                if (count > 0) {
                    for (int i = 0; i <= right; i++) {
                        System.out.print(arr[top][i] + " ");
                        count--;
                    }
                    top++;
                }
                if (count > 0) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(arr[top][i] + " ");
                        count--;
                    }
                    top++;
                }
            }

        }
    }
}
