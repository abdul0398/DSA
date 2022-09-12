package DSA.Array;
public class practice {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,1,1,2,4,5};
        int maxSum = partition(arr);
        System.out.println(maxSum);
    }
// time complexity is O(n)
    public static int partition(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        int[] freq = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - min ] = freq[arr[i] - min] + 1;
        }
        System.out.println(freq[5]);
        int ans = 0;
        int residue = 0;
        for (int i = min; i <=max ; i++) {
            ans = ans + (freq[i - min] + 1 - residue) / 2;
            residue = (freq[i - min] + residue) % 2;
        }
        return ans;
    }
}