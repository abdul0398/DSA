
public class main {
    public static long makeIntegerBeautiful(long n, int target) {
        
        for(int i = 0; i <= 150; i++){
            long y = n + i;
            int sum = 0;
            while(y > 0){
                sum += y % 10;
                y = y / 10;
            }
            if(sum <= target){
                return (long)i;
            }
            
        }
        return -1;
        
        
        
    }
    

    public static void main(String[] args) {
       CLL list = new CLL();
       list.insertLast(7);
       list.insertLast(8);
       list.insertLast(9);
       list.insertLast(0);
       list.insertLast(3);
       list.insertLast(2);
       list.display();
       list.delete(0);
       list.display();

    }
}