package DSA.Array;
/*
C. Building Permutation (codeforces)
Permutation p is an ordered set of integers p1,  p2,  ...,  pn, consisting of n distinct positive integers,
each of them doesn't exceed n. We'll denote the i-th element of permutation p as pi. We'll call number n 
the size or the length of permutation p1,  p2,  ...,  pn.

You have a sequence of integers a1, a2, ..., an. In one move, you are allowed to decrease or increase any number by one.
Count the minimum number of moves, needed to build a permutation from this sequence.
 */
import java.util.*;
public class BuildingPermutation {
    public static void main(String args[]) {
// -3, 5,-3, 3, 3;
        int i = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            a[0] = Integer.MIN_VALUE;
            for (i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int count = 0;
            for (i = 1; i <= n; i++){
                count += Math.abs(a[i] - i);
            }
            System.out.print(count);




        }

    }
}
