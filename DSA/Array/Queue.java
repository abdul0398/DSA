public class Queue {
// Linked List class-
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
// Queue using Array (add time is O(1), poll time O(n), peek time is O(1)); 
    static class queueArray{
        int[] arr;
        int rear;
        int capacity;
        queueArray(int capacity){
            this.capacity = capacity;
            arr = new int[capacity];
            rear = 0;
        }
        //enqueue O(1);
        public void push(int data){
            if(rear == capacity){
                System.out.println("queue is full");
                return;
            }
            arr[rear] = data;
            rear++;
        }
        // dequeue O(n)
        public int poll() {
            if(rear == 0){
                System.out.println("queue is empty");
                return -1;
            }
            int x = arr[0];
            for(int i = 0; i < rear - 1 ; i++){
                arr[i] = arr[i+1];
            }
            arr[rear] = 0;
            rear--;
            return x;
        }
        public void display(){
            if(rear == 0){
                System.out.println("queue is Empty");
                    return;
            }
            for (int i = 0; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public void size(){
            System.out.println(rear);
        }
    }
    static class CircularqueueArray{
        int[] arr;
        int rear;
        int capacity;
        int front;
        CircularqueueArray(int capacity){
            this.capacity = capacity;
            arr = new int[capacity];
            rear = 0;
            front = 0;
        }
        //enqueue O(1);
        public void push(int data){
            if(rear + 1 == front){
                System.out.println("queue is full");
                return;
            }
            arr[rear] = data;
            rear = (rear++) % capacity;
        }
        // dequeue O(n)
        public int poll() {
            if(rear == 0){
                System.out.println("queue is empty");
                return -1;
            }
            int x = arr[front];
            front = (front++) % capacity;
            return x;
        }
        public void display(){
            if(rear == 0){
                System.out.println("queue is Empty");
                    return;
            }
            while(front != rear){
                System.out.println(arr[front % capacity]);
            }
            System.out.println();
        }
        public void size(){
            System.out.println(rear);
        }
    }
// Queue using LinkedList
    static class QueueLinkedList{
        Node rear;
        Node front;
        QueueLinkedList(){

        }
        public void add(int data){
            Node x = new Node(data);
            if(front == null && rear == null){
                front = x;
                rear = x;
                return;
            }
            rear.next = x;
            rear = x;
        }
        public int peek(){
            return front.data;
        }
        public int poll(){
            if(front == null){
                System.out.println("queue is empty");
                return -1;
            }
            int x = front.data;
            front = front.next;
            return x;
        }
        public void display(){
            Node temp = front;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        public boolean isEmpty(){
            return front == null;
        }
    }

    public static void main(String[] args) {
        queueArray q = new queueArray(10);
        q.push(8);
        q.push(1);
        q.push(2);
        q.push(3);
        q.display(); 
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        QueueLinkedList qq = new QueueLinkedList();
        qq.add(0);
        qq.display();
        System.out.println();
        qq.poll();
        qq.display();
    }
}
