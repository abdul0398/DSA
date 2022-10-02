import java.util.*;
public class practice {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long q = sc.nextLong();
            long[] arr = new long[(int) n];
            long[] pre = new long[(int) (n + 1)];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            for (int i = 0; i < q; i++) {
                long l = sc.nextLong();
                long r = sc.nextLong();
                pre[(int) (l - 1)]  += 1;
                pre[(int) r] -= 1;
            }
            for (int i = 1; i < pre.length; i++){
                pre[i] += pre[i-1];
            }
            Arrays.sort(pre);
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i] * pre[i + 1];
            }
            System.out.println(sum);
        }
        




	}
}
