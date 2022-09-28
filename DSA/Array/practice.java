package DSA.Array;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()];
        int i = 1;
        int j = 0;
        String str1 = "";
        while (i <= str.length()) {
            if (str.charAt(j) == str.charAt(i)) {
                if (i != str.length() - 1) {
                    i += 2;
                    j += 2;
                }else{
                    i++;
                    j++;
                }
            } else {
                if (i != str.length() - 1) {

                str1 += str.charAt(j);
                j++;
                i++;
            }else{
                str1 +=str.charAt(i);

            }

            }
        }
        System.out.println(str1);

    }

}