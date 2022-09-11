package DSA.Array.BinarySearch;

public class squareRoot{
    public static void main(String[] args) {
        double nam = name(37,3,root(37));
        System.out.println(nam);
    }

    public static double name(int n, int precision, long root) {
        double factor = 1;
        double ans = root;
        for (int i = 0; i < precision; i++) {
            factor  = factor/10;
            for (double j = ans; j*j < n; j += factor) {
                ans = j;
            }
        }
        return ans;
        
    }
    public static long root(long n){
// here we took the long as if mid is near about 2^31 that mid*mid exceed the int limit and gives overflow.
        long s = 0;
        long e = n;
        long mid = s + (e - s) / 2;
        long answer = -1;
        while(e >= s){
            if(mid * mid == n){
                return (int)mid;
            }
            else if(mid * mid < n){
                s = mid + 1;
                answer = mid;
            }else{
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
            
        }
//but we need to return int so we use (int) which convert long to int.
        return (int)answer;

}
}

