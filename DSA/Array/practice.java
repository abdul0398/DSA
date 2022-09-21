package DSA.Array;

public class practice {

    public static void main(String[] args) {
        int row = 9;
        int nst = 1;
        int nsp = row - 1;
        int nsp2 = -1;
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print(" ");
            }
            int sum = nst;
            for (int j = 1; j <= nst; j++) {
                System.out.print(sum+"");
                sum--;
            }
            for (int j = 1; j <= nsp2; j++) {
                System.out.print(" ");
            }
            int sum1 = 1;
            for (int j = 1; j <= nst; j++) {
                if(nst == 1){
                    continue;
                }
                System.out.print(sum1);
                sum1++;   
            }
            System.out.println("");
            if (i <= row / 2) {
                nst++;
                nsp -= 2;
                nsp2 += 2;
            } else {
                nst--;
                nsp += 2;
                nsp2 -= 2;
            }

        }
    }
}
