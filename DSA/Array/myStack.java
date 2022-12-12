public class myStack {
// stack using an array
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
    }
}
