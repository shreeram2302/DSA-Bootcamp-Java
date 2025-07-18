import java.util.Scanner;

class ListNode {
    Node head, tail;
    int size = 0;


    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    void insertFir(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    void insert(int value) {
        if (tail == null) {
            insertFir(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");

    }

    boolean isCycle(){
        Node slow = head;
        Node fast = head;


        while (fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow.value==fast.value){
                return true;
            }
        }
        return false;
    }
    int countLenOfCycle(){
        Node slow=head;
        Node fast=head;
        int count=1;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){

             do {
                 slow=slow.next;
                 count++;
             }while (slow!=fast);
                return count;
            }

        }

        return 0;
    }

    Node startOfCycle(){
        int len=countLenOfCycle();
        Node f=head;
        Node s=head;
        for (int i = 0; i < len; i++) {
            s=s.next;
        }

        do{
            s=s.next;
            f=f.next;
            if (s==f){
                return s;
            }

        }while (s!=f);

        return null;

    }
}

public class LinklistExmp2 {

    public static void main(String[] args) {
            ListNode n= new ListNode();
            Scanner s= new Scanner(System.in);
            int a=0;
            while (a<5){
                n.insert(s.nextInt());
            a++;
            }
            n.display();
        n.isCycle();
    }
}
