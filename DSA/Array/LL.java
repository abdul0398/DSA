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
