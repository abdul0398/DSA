package DSA.Array;
import java.util.*;
public class imp_hamburger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String sequence = sc.next();
            int nb = sc.nextInt(), ns = sc.nextInt(), nc = sc.nextInt();
            int pb = sc.nextInt(), ps = sc.nextInt(), pc = sc.nextInt();
            long rubles = sc.nextLong();
            long start = 0;
            long end = 1000000010000L;
            long mid = start + (end-start)/2;
            long cb  = 0, cs = 0, cc = 0;
            long ans = 0;
            for (int i = 0; i < sequence.length(); i++) {
                if(sequence.charAt(i) == 'B'){
                    cb++;
                }else if(sequence.charAt(i) == 'S'){
                    cs++;
                }else {
                    cc++;
                }
            }
            
              while(end >= start){
                if(rublesNeeded(mid,cb,cs,cc,nb,ns,nc,pb,ps,pc) <= rubles){
                    start = mid+1;
                    ans = mid;
                }else{
                    end = mid - 1;
                }
                mid = start + (end-start)/2;
            }
            System.out.println(ans);
    }
}
        static long rublesNeeded(long mid,long cb,long cs,long cc, int nb, int ns, int nc,int pb, int ps,int pc){
            long costOfBread =  ((mid * cb)-nb) > 0? ((mid * cb)-nb) * pb : 0;
            long costOfSousage = ((mid * cs)-ns) > 0? ((mid * cs)-ns) * ps : 0;
            long costOfcheese = ((mid * cc)-nc) > 0? ((mid * cc)-nc) * pc : 0;
            long rublesNeeded =  costOfBread + costOfSousage + costOfcheese ;
            return rublesNeeded;

}
}