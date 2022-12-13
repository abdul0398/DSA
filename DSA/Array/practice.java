import java.util.*;
public class practice {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		int[] arr = {62,2,8,10,11,7,2};
		int[] dep= {10,10,8,9,12,13,10,13};
		// for(int i = 0; i < a; i++){
		// 	arr[i] = sc.nextInt();
		// }
		// for(int i = 0; i < b; i++){
		// 	dep[i] = sc.nextInt();
		// }
		Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1;
        int j = 0;
        int plat = 1;
        int res = 1;
        while(i < arr.length && j < arr.length){
            if(arr[i] < dep[j]){
                i++;
                while(i == i + 1){i++;}
            }else if(arr[i] >= dep[j]){
                plat++;
                j++;
                while(j == j+1){j++;}
            }
            if(res < plat){
                res = plat;
            }
        }
      System.out.println(res);

    }
}