import java.util.*;
public class vasyaAndString {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int n = sc.nextInt();
            int[] arr = new int[s.length()];
            char[] ch = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                int x = sc.nextInt();  
                arr[x - 1] += 1;
            }
            System.out.println(Arrays.toString(arr));
            for (int i = 1; i < arr.length; i++) {
                arr[i] += arr[i - 1];
            }
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < ch.length / 2; i++) {
              if(arr[i] % 2 == 1){
                char temp = ch[i];
                ch[i] = ch[(ch.length - i - 1)];
                ch[(ch.length - i - 1)] = temp;
              }
            }
            System.out.println(new String(ch));
          }

    }
}
