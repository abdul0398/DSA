package DSA.Array;
public class practice {
    public static void main(String[] args) {
        int sum = conversion(101010, 2, 10);
        System.out.println(sum);
    }
    public static int conversion(int num, int sb, int rb){
        int digit = 0;
        int power = 1;
        int sum = 0;
        while(num!=0){
            digit = num % rb;
            sum += digit * (power);
            power = power * sb;
            num = num / 10;
        }
        return sum;

    }
}