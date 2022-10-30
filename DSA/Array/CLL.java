
public class CLL {
    private node head;
    private node tail;

    public void insertLast(int val){
        node node = new node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        node temp = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.print(temp.val + " --> ");
        while(temp != tail){
            temp = temp.next;
            System.out.print(temp.val + " -->");
        }
        System.out.println("END");
    }

    public void delete(int val){
        node node = head;
        if(node == null){
            return;
        }
        if(node.val == val){
            tail.next = node.next;
            head = tail.next;
            return;
        }
        do {
            node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            } 
            node = node.next;
            
        } while (node != head);
         




    }



        private class node{
            int val;
            node next;

            public node(int val){
                this.val = val;
            }
            public node(int val,node next){
                this.val = val;
                this.next = next;
            }





        } 




}
