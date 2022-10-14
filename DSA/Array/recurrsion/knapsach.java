package recurrsion;

public class knapsach {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        System.out.println(knapsack(50, 0, val, weight));
}

    static int knapsack(int capacity, int i, int val[], int weight[]){
        if(capacity == 0|| i > val.length - 1){
            return 0;
        }
        if(weight[i] > capacity){
          return knapsack(capacity, i + 1, val, weight); 
        }
      
      // knapsach unbounded 
        int op1 = val[i] + knapsack(capacity - weight[i], i, val, weight);
        int op2 = knapsack(capacity, i + 1, val, weight);
        return Math.max(op1,op2);
    }

}
