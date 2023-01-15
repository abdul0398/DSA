public class LinkedList {
    // not static bcoz every list object has its own head
    Node head;
    // private bcoz only object of LinkedList can access that 
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public void createFromArray(int[] arr){
        if(head == null){
            head = new Node(arr[0]);
        }
        Node temp = head;
        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
    }
    public void insertLast(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }
    public void insertFirst(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }
    public void iterator(Node head){
        Node temp = head;
        while(temp != null){
           System.out.print(temp.data + " ");
           temp = temp.next;
        }
    }
// Linked List reverse fuction Recurrsive.
    public Node reverseRecurrsive(Node head){
            if(head.next == null){
                return head;
            }
            Node newHead = reverseRecurrsive(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
    }
// Linked List reverse fuction Itertively.
    public Node reverseIteratively(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    public static void main(String[] args){
        // list ka object banaya phle 
        LinkedList list = new LinkedList();
        int[] arr = {1,2,3,4,5,6};
        // array se list bnayi;
        list.createFromArray(arr);
        //list pe itrate kiya
        list.iterator(list.head);
        // zero first p insert kiya
        list.insertFirst(0);
        System.out.println("");
        list.iterator(list.head);
        //last me insert kiya
        list.insertLast(7);
        System.out.println("");
        list.iterator(list.head);
        list.head = list.reverseIteratively(list.head);
        System.out.println("");
        list.iterator(list.head);
    }

}
