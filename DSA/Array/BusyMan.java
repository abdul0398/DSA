import java.util.*;
public class BusyMan {
    static class Activity{
        int start;
        int end;
        Activity(int start,int end){
            this.start = start;
            this.end = start;
        }
    }
    static int solve(Activity[]arr){
        Arrays.sort(arr,new Comparator<Activity>{

        });
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        Activity[] arr= new Activity[100005];
        for(int i = 0; i < n; i++){
            arr[i].start = sc.nextInt();
            arr[i].end = sc.nextInt();
        }
        solve(arr);
    }
}
