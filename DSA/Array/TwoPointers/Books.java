import java.util.Scanner;
public class Books {

    public static void main(String[] args) {
        System.out.println(check());
        
    }

    public static int check() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int book = 0;
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (sum > k) {
                    sum -= arr[j];
                    j++;
                }
                if((i - j + 1) > book){
                    book = i - j + 1;
                }
            }
            return book;
        }
    }

}