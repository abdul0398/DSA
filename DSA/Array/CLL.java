
public class CLL {
    public node head;
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

    public node reverse(node head){
        if(head == null || head.next == null){
            return head;
        }
        node nextNode = reverse(head.next);
        node c = head;
        c.next.next = c;
        c.next = null;
        return nextNode;
    }
        static private class node{
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
