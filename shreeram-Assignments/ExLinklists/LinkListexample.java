import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/// leeet codde ques..

public class LinkListexample {

//    static LeetCodeQues duplicates;
    Node head,tail;
    int size=0;


    private class Node {


        int value;
        Node next;

        public Node(){

        }
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    void insertFir(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;
    }
    void insert(int value){
        if (tail==null){
            insertFir(value);
            return;
        }

        Node node= new Node(value);
            tail.next=node;
            tail=node;
            size+=1;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");

    }


    //Remove duplicates from sorted list
    private List<Integer> remDupes(Node head){

        List<Integer> duplicates= new ArrayList<>();
        Node node=head;
        while(node!=null){
            if (node.next!=null && node.value == node.next.value){
                duplicates.add(node.value);
//                duplicates.insert(node.next.value);
                node.next=node.next.next;
                size--;
            }
            node=node.next;
        }

        tail=head;
        tail.next=null;
        return duplicates;
    }

    public void removeDuplicates(Node node){

        List<Integer> l =remDupes(node);

        System.out.println(l);


    }


    //Merge @ Sorted Lists

    void Merge(LinkListexample first, LinkListexample second){
            Node f=first.head;
            Node s= second.head;

//        System.out.println(first.head.value);
//        System.out.println(second.head.value);
        LinkListexample ans = new LinkListexample();

            while (f != null && s !=null ){
                if (f.value <s.value ){

                    ans.insert(f.value);
                    f=f.next;

                }else {
                    ans.insert(s.value);
                    s= s.next;
                }
            }


            while (f!=null){
                ans.insert(f.value);
                f=f.next;
            }

            while (s!=null){
            ans.insert(s.value);
            s=s.next;
            }

            ans.display();

        removeDuplicates(ans.head);

    }

    public static void main(String[] args) {
        LinkListexample d=new LinkListexample();
        LinkListexample d1=new LinkListexample();
        System.out.println("enter values");
        Scanner s= new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            d.insert(s.nextInt());
        }
        d.display();
//
//        d.removeDuplicates();
        for (int i = 0; i < 4; i++) {
            d1.insert(s.nextInt());
        }

        d1.display();


        d.Merge(d,d1);





    }

}
