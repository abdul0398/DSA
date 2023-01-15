import java.util.*;

public class comparator {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int id, int deadline, int profit ){
            this.deadline = deadline;
            this.id = id;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        Job[] arr = new Job[4];
        int profit = 10;
        int deadline = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Job(i + 1, deadline, profit);
            deadline += 1;
            profit += 10;
        }
// Sorting in decending order;
// to sort in ascending order we use (a.profit - b.profit)
// Extended form of comparator 
//### IMPORTANT if negative values are given int he array then use 
/*
 * if(a < b){
 *      return -1;
 * }else{
 *      return 1;
 * }
 * if a is negative and b is positive the a - b will be negative it gets swapped
 * but they are already in correct position, hence we use compare function here.
 */
        Arrays.sort(arr, new Comparator<Job>(){
            @Override
            public int compare(Job a, Job b){
                return b.profit - a.profit;
            }
        });
// short form of comparator using lambda..
        Arrays.sort(arr, (a,b) -> (b.profit - a.profit));
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i].profit);
        // }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i].deadline);
        }
        int[] maxDead = new int[max + 1];
        int tProfit = 0;
        int noOfJobs = 0;
        for (int i = 0; i < arr.length; i++) {
            tProfit += arr[i].profit;
            int currDeadLine = arr[i].deadline;
                while(maxDead[currDeadLine] != 0){
                    currDeadLine--;
                    if(currDeadLine == 0){
                        break;
                    }
                }
                if(currDeadLine != 0){
                    noOfJobs++;
                    maxDead[currDeadLine] = 1;
                }
        }
        System.out.println(tProfit + "    " + noOfJobs);
    }
}
