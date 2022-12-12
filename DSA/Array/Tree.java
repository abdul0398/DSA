public class Tree {
    node root;


    private class node{

        private int data;
        private node right;
        private node left;
        node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
}
