import java.util.*;
public class DevuAndHisBrother {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextInt();
            long m = sc.nextInt();
            PriorityQueue<Long> pn = new PriorityQueue<>();
      // doubt yaha pe reverse kyu kiya gya, agar reverse ni krte to bi ans ajata..i.e Collection.reverseOrder()
            PriorityQueue<Long> pm = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
              pn.add(sc.nextLong());
            }
            for (int i = 0; i < m; i++) {
              pm.add(sc.nextLong());
            }
            long ans = 0;
            while (!pn.isEmpty() && !pm.isEmpty() && (pn.peek() < pm.peek())) {
              ans += Math.abs((pn.peek() - pm.peek()));
              pn.remove(pn.peek());
              pm.remove(pm.peek());
            }
            System.out.println(ans);
          }
    }
}
