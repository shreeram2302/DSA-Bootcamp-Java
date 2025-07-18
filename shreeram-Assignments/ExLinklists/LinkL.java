class LinkL{
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

    private Node head;
    private Node tail;
    private int size;



    public LinkL() {
        this.size = 0;
    }

    void insertFir(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;

    }

    void insertLast(int val){

        if (tail==null){
            insertFir(val);
            return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail= node;
        size++;
    }

    void insert(int val,int index){
        if (index==0){
            insertFir(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        Node node= new Node(val,temp.next);
        temp.next=node;
        size++;
    }
///Recursion

    void InsertionInRec(int val,int index){

        head=RecInsertion(val,index,head);
        System.out.println(head.next);

    }
    private Node RecInsertion(int val, int index,Node node){

        if (index==0){
            Node node1= new Node(val,node.next);
            node.next=node1;
            size++;
            return node1;
        }

        node.next=RecInsertion(val,index-1,node.next);
        return node;
    }

    int deleteFirst(){
        int val=head.val;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }
    int deleteLast(){
        if (size<=1)
        {
            return deleteFirst();
        }
       Node secondLast=get(size-2);
        int val= tail.val;
        tail=secondLast;
        tail.next=null;
        size--;
        return  val;
    }

    int deleteAt(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }

        Node prev=get(index-1);
        int val= prev.next.val;

        prev.next=prev.next.next;

//        System.out.println(prev.val);
        return val;
    }

    void update(int val,int index){
        Node n=get(index);
        n.val=val;
    }

    Node get(int index){
        Node node=head;
        for (int i = 0; i <index; i++) {
            node=node.next;
        }
        return  node;
    }

//    private Node get(int index,Node node){
//       node=get(index-1,node.next);
//       return node;
//    }

    void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val + " -> ");

            temp=temp.next;

        }
        System.out.println("END");
    }

/////////////////Recursion?????????????????????????


    public void insertRec(int val ,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){

        if(index==0){
            Node temp= new Node(val,node);
            size++;
            return temp;
        }

        node.next=insertRec(val,index-1,node.next);
        return node;
    }


}