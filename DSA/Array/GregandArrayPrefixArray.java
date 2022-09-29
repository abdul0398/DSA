/* QUESTION CODEFORCES 296C (GREG AND ARRAY)
Greg has an array a = a1, a2, ..., an and m operations. Each operation looks as: li, ri, di, (1 ≤ li ≤ ri ≤ n). 
To apply operation i to the array means to increase all array elements with numbers li, li + 1, ..., ri by value di.
Greg wrote down k queries on a piece of paper. Each query has the following form: xi, yi, (1 ≤ xi ≤ yi ≤ m). 
That means that one should apply operations with numbers xi, xi + 1, ..., yi to the array.
Now Greg is wondering, what the array a will be after all the queries are executed. Help Greg.
Input
The first line contains integers n, m, k (1 ≤ n, m, k ≤ 105). The second line contains n integers: a1, a2, ..., an (0 ≤ ai ≤ 105) — the initial array.
Next m lines contain operations, the operation number i is written as three integers: li, ri, di, (1 ≤ li ≤ ri ≤ n), (0 ≤ di ≤ 105).
Next k lines contain the queries, the query number i is written as two integers: xi, yi, (1 ≤ xi ≤ yi ≤ m).
The numbers in the lines are separated by single spaces.*/
package DSA.Array;
import java.util.*;
public class GregandArrayPrefixArray {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size = 100005;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n+1];
            for(int i = 1;i <= n; ++i){
                arr[i] = sc.nextInt();
            }
            int[] l = new int[m+1];
            int[] r = new int[m+1];
            int[] d = new int[m+1];

            for(int i = 1;i <= m; ++i){
                l[i] = sc.nextInt();
                r[i] = sc.nextInt();
                d[i] = sc.nextInt();
            }
            int[] operation_count = new int[size];
            for(int i = 1; i <= k; ++i ){
                int x = sc.nextInt();
                int y = sc.nextInt();
                operation_count[x] = operation_count[x] + 1;
                operation_count[y+1] = operation_count[y+1] - 1;
            }
            for(int i = 1; i < operation_count.length; i++){
                operation_count[i] = operation_count[i] + operation_count[i-1];
            }
            int[] preffix = new int[size];
            for(int i = 1; i <= m; ++i){
                preffix[l[i]] = preffix[l[i]] + d[i] * operation_count[i];
                preffix[r[i]+1] = preffix[r[i]+1] - d[i] * operation_count[i];
            }
            for(int i = 1; i < preffix.length; i++){
                preffix[i] += preffix[i-1];
            }
            for(int i = 1; i <= n; i++){
                arr[i] += preffix[i];
            }
            for(int i = 1; i <= n; i++){
                System.out.println(arr[i] + " ");
            }
        }

    }
}
