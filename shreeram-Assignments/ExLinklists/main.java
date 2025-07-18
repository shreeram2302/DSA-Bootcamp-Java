import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        LinkL l= new LinkL();
        System.out.println("Enter values..");
        Scanner s = new Scanner(System.in);
        for (int i=0;i<4;i++){
            int a= s.nextInt();
            l.insertLast(a);

        }
        l.InsertionInRec(686867,0);
//        l.insert(8099,1);
        l.display();
//        System.out.println(l.deleteFirst());


//        System.out.println(l.deleteAt(3));
//        l.update(69696,2);
//        l.display();
//
//        l.deleteAt(2);

//        l.insertRec(49490,2);
//        l.display();
    }
}
