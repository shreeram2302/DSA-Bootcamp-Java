public class DoublyList {

    Node head;
    Node tail;
    private int size;

    DoublyList(){
        size=0;
    }
    void insertFirst(int val){
       Node node = new Node(val);
       node.next=head;
        node.pre=null;

        if (head==null){
            head=node;
            tail=head;
        }else {
            head.pre = node;
            head=node;
        }
        size++;
    }


    void InsertAt(int val,int index){
        if (head==null){
            insertFirst(val);
            return;
        }
        Node temp=tail;
        for (int i = 0; i < index; i++) {
            temp=temp.pre;
        }
        System.out.println(temp.val);

        Node node= new Node(val);
        node.next=temp.next;
        temp.next.pre=node;


        temp.next=node;
        node.pre=temp;

        size++;


    }
    void insertLast(int val){
        if (head==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);

        head.next=node;
        node.pre=head;

        head=node;
        size++;
    }

    void disp3(){
        Node node=tail;
        while (node!=null){
            System.out.print(node.val+" -> ");
            node=node.next;
        }
        System.out.println(" END ");
    }
    void disp2(){
        Node node=tail;
        while (node!=null){
            System.out.print(node.val+" -> ");
            node=node.pre;
        }
        System.out.println(" END ");
    }

    void display(){
        Node node= head;
        while (node!=null){
            System.out.print(" -> "+node.val);
            node=node.next;
        }
        System.out.println(" END ");

    }

    void Update(int index,int val){
        Node node= get(index);
        node.val=val;
    }

    Node get(int index){
        Node node= tail;

        for (int i = 1; i <=index; i++) {
            node=node.pre;
        }
        return node;
    }

    void deleteFirst(){
        Node node= tail;

        tail=node.pre;

        node.pre.next=null;
        node.pre=null;
//        System.out.println(tail.val);
        size--;

    }
    void deleteLast(){
        Node node= head;

        head=node.next;

        node.next.pre=null;
        node.next=null;
//        System.out.println(tail.val);

        size--;

    }
    void delete(int index){

        System.out.println(size);
        if (index==0){
            deleteFirst();
            size--;
            return;

        }
        if (index==size){
            deleteLast();
            size--;
            return;
        }
        Node node=get(index);
        node.next.pre=node.pre;
        node.pre.next=node.next;

        size--;

    }
    private class Node {
        private int val;
        Node next;
        Node pre;

        Node(int val){
        this.val=val;
        }

        public Node(int val, Node next, Node pre) {
            this.val = val;
            this.next = next;
            this.pre = pre;
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter values..");

        DoublyList d=new DoublyList();
            d.insertFirst(1);
            d.insertFirst(2);
            d.insertFirst(3);
            d.insertFirst(4);
            d.insertFirst(5);

//        d.insertLast(1);
//        d.insertLast(2);
//        d.insertLast(3);
//        d.insertLast(4);

            d.disp2();
            d.InsertAt(99,1);

            d.disp2();


//        d.Update(1,5857);
//        d.disp2();
//
//        d.delete(5);
//        d.disp2();

    }

}
