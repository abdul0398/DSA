package DSA.Array;
import java.util.*;
public class BrokenKeyboard {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
              int t = sc.nextInt();
                while(t-- > 0){
                int i = 1;
                String str1 = "";
                String str = sc.next();
                str = str + " ";
                char temp = str.charAt(0);
                while (i < str.length()) {
                    if (str.charAt(i) != temp) {
                        str1 += temp;
                        temp = str.charAt(i);
                        i++;
                    } else {
                        temp = str.charAt(i + 1);
                        i += 2;
                    }
                    
                }
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (str1.indexOf(ch) > -1) {
                        System.out.print(ch);
                    }
                    
                }
                System.out.println();    
            }
        }

    }
}
    
