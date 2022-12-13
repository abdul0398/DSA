import java.util.*;
public class BST {
    Scanner sc = null;
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
        public void insert(int val){
            if(root == null){
                root = new Node(val);
                return;
            }
        }
    }
    static public void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    static public void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        inorder(node.left);
        inorder(node.right);
    }
// build BST from a sorted array;
    static Node buildTree(int[] arr,int start,int end){
        if(start > end){
            return null;
        }
        int mid = (end + start) / 2;
        Node node = new Node(arr[mid]);
        node.left = buildTree(arr, start, mid - 1);
        node.right = buildTree(arr, mid + 1, end);
        return node;
    }
    // To find the Kth smallest and kth largest elements in BST
    static void KthSmallest(Node node, int[] k,int[] res){
        if(node == null){
            return;
        }
        KthSmallest(node.right,k,res);
        k[0]--;
        if(k[0] == 0){
            res[0] = node.data;
            return;
        }
        KthSmallest(node.left,k,res);
    }
// iterator for BST which can start from low and also can start from end, with using reverse variable; 
    static class BSTIterator{
        private Stack<Node> s = new Stack<>();
        //reverse used to decide the direction of iteration
        boolean reverse;
        BSTIterator(Node root,boolean isreverse){
            reverse = isreverse;
            goLeft(root);
        }
        private void goLeft(Node root){
            while(root != null){
                s.push(root);
                root = reverse == true?root.right:root.left;
            }
        }
        public int next(){
            Node node = s.pop();
            if(reverse == false){goLeft(node.right);}
            else{goLeft(node.left);}
            return node.data;
        }
        public boolean hasNext(){
            return !s.isEmpty();
        }
    }
    static class Nodes{
        int size, max, min;
        Nodes(int max, int min, int size){
            this.max = max;
            this.min = min;
            this.size = size;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,4};
        Node node = buildTree(arr, 0, 4);
        // preorder(node);
        // int[] res = new int[1];
        // solve(node, new int[]{3},res);
        // System.out.println(res[0]);
        //BSTIterator b = new BSTIterator(node,false);
       //System.out.println(b.next());
    }
}