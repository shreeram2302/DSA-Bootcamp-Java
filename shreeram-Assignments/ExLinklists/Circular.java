public class Circular {

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node head,tail;
    int size;
    Circular(){
        size=0;
    }

    void insert(int val){
        Node node= new Node(val);

        if (tail==null){
            tail=node;
            head=node;
            return;
        }
        head.next=node;
        node.next=tail;
        head=node;
        size++;
    }

    void display(){
        Node node=head;
        for (int i = 0; i <=4; i++) {
            System.out.print(node.val+" -> ");
            node=node.next;
        }



    }

    public static void main(String[] args) {
        Circular c= new Circular();
        c.insert(1);
        c.insert(928);
        c.insert(9);
        c.insert(8);
        c.insert(2);
        c.display();
    }
}
