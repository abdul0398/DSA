import java.util.*;
public class main{
    static main s = new main();
    class Node{
        int data;
        Node left = null, right = null;
     
        Node(int data) {
            this.data = data;
        }
    }
    public static Node balanced(int[] keys, int low, int high, Node root)
    {
        if (low > high) {
            return root;
        }
        int mid = (low + high) / 2;
        root = s.new Node(keys[mid]);
        root.left = balanced(keys, low, mid - 1, root.left);
        root.right = balanced(keys, mid + 1, high, root.right);
        return root;
    }
    static void level(Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node root = q.poll();
            System.out.print(root.data + " ");
            if(root.left != null){q.add(root.left);}
            if(root.right != null){q.add(root.right);}
        }
    }
    static boolean check(double number) {     
        double sqrt = Math.sqrt(number);   
        return ((sqrt - Math.floor(sqrt)) == 0);   
    }   
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,6,16,8,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ans = (int)Math.sqrt(nums[i]);
            if(ans*ans == nums[i] && map.containsKey(ans)){
                map.put(nums[i], map.get(ans) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        int x = 6;
          int y = (int)Math.sqrt(x);
        System.out.println(y);


    }
}             
