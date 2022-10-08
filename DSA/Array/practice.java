import java.util.*;

public class practice {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      String[] arr = new String[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.next();
        }
        Comparator<String>  comp = new Comparator<String>() {
          public int compare(String o1, String o2) {
            
            return 0;
          }
          
        };
        Arrays.sort(arr)
        System.out.println(Arrays.toString(arr));
    
    
      }
  }
}
  
