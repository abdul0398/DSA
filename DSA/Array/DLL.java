public class DLL {
    private node head;


    public void insertLast(int val,int index){
        node node = new node(val);
        node temp = get(index);
            node temp2 = temp.next;
            temp2.prev = node;
            temp.next = node;
            node.next = temp2;
            node.prev = temp;
    }
    public node get(int index){
        node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp;


    }




    private class node{
        int val;
        node next;
        node prev;


        node(int val){
            this.val = val;
        }
        node(int val,node next,node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }



}
