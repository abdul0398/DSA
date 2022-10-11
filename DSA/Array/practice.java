import java.util.Arrays;

public class practice {
  public static void main(String[] args) {
      long[] arr = {8,4,5,3,1,7,9};
      long[] arr1  = {5,1,3,7,9};
      System.out.println(isSubset(arr, arr1, 7, 5));
    }
    public static int isSubset( long a1[], long a2[], long n, long m) {
      long[] freq1 = new long[100005];
      long[] freq2 = new long[100005];
      int count = 0;
      for(int i = 0; i < n; i++){
          freq1[(int)a1[i]] += 1;
      }
      for(int i = 0; i < m; i++){
          if(freq2[(int)a2[i]] == 0){
              freq2[(int)a2[i]] += 1;
              count++;
          }else{
              freq2[(int)a2[i]] += 1;
          }
      }
      int sum = 0;
      for(int i = 0; i < m; i++){
          if(freq2[i] != 0){
              if(freq2[i] <= freq1[i]){
                   sum++;
              }
          }
      }
      return sum;
      // if(count == sum){
      //     return "Yes";
      // }else{
      //     return "No";
      // }
}
}
