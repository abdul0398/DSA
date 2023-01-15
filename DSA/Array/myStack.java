public class myStack {
// stack using an array , need to provide size of an array through a contructor
    static class mystack{
        int[] arr;
        int top;
        int size;
        mystack(int capacity){
            arr = new int[capacity];
            top = -1;
        }
        public void push(int x){
            top++;
            arr[top] = x;
            size++;
        }
        public int peek(){
            return arr[top];
        } 
        public int poll(){
            int res = arr[top];
            top--;
            size--;
            return res;
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return top == -1;
        }

    }
// stack using LinkedList dynamic memory allocation, static so that we dont need to make an object of main class;
    static class stackLinkedList{
        int size;
        Node head;
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        public void addFirst(int val){
            Node n = new Node(val);
            if(head == null){
                head = n;
                return;
            }
            n.next = head;
            head = n;
        }
    }
        public void push(int val){
            size++;
            Node n = new Node(val);
            if(head == null){
                head = n;
                return;
            }
            n.next = head;
            head = n;
        }
        public int poll(){
            if(head == null){
                return -1;
            }
            size--;
            Node temp = head;
            head = head.next;
            int x = temp.val;
            temp.next = null;
            return x;
        }
        public boolean isEmpty(){
            return size == 0;
        }

    }


    public static void main(String[] args) {
        mystack s = new mystack(5);
        s.push(5);
        s.push(4);
        s.push(7);
        s.push(3);
        s.push(1);
        System.out.println(s.size());
        s.poll();
        System.out.println(s.size());
        stackLinkedList ss = new stackLinkedList();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);
        ss.push(6);
        System.out.println(ss.size);
        System.out.println(ss.poll());



    }
}
