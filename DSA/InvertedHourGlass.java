package DSA;

public class InvertedHourGlass {
    public static void main(String[] args) {
/*      5                   5 
        5 4               4 5 
        5 4 3           3 4 5 
        5 4 3 2       2 3 4 5 
        5 4 3 2 1   1 2 3 4 5 
        5 4 3 2 1 0 1 2 3 4 5 
        5 4 3 2 1   1 2 3 4 5 
        5 4 3 2       2 3 4 5 
        5 4 3           3 4 5 
        5 4               4 5 
        5                   5
  */      
        int n = 5;
        int rows = 2*n + 1;
        int nst1 = 1;
        int nsp = 2*n - 1;
        int nst2 = 1;
        for (int j = 1; j <= rows; j++) {
            int count = n;
            for (int i = 1; i <= nst1; i++) {
                System.out.print(count+" ");
                count--;
            }
            for (int i = 1; i <= nsp; i++) {
                System.out.print(" ");
            }
            int cst = 1;
            if (j == n+1) {
                cst = 2;
                count++;
            }else{
                count++;
            }
            for (; cst <= nst2; cst++) {
                System.out.print(count);
                count--;
            }
            System.out.println();
            if (j <= n){
                nst1++;
                nst2++;
                nsp -= 2;
            }else{
                nst1--;
                nst2--;
                nsp +=2;

            }
        }
    }
}
