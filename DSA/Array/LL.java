public class LL {

    private node head;
    private node tail;
    private int size;
    public LL(){
        this.size = size;

    }
public void insertFirst(int value){
    node node = new node(value);
    node.next = head;
    head = node;

    if(tail == null){
        tail = head;

    }
    size ++;
}
    public void reverse(node head){
        // node temp = head;
        // while(temp.next != null){
        //     if(temp.value == val){
        //         return true;
        //     }
        //     temp = temp.next;

        // }
        // return false;
            node fast = head.next;
            node slow = head;
            if(fast.next == head){
                return;
            }
            reverse(head.next);
            fast.next = slow;
    }




    private class node{
        private int value;
        private node next; 
        public node(int val){
            this.value = value;
        }
        public node(int value,node next){
            this.next = next;
            this.value = value; 

        }

    }
}
