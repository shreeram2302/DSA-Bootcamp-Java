public class StackQueueMain {

    public static void main(String[] args) throws Exception {
//        DynamicStack c= new DynamicStack();
//        c.push(10);
//        c.push(10);
//        c.push(10);
//        c.push(10);
//        c.push(10);
//        c.push(10);
//        c.push(10);
//        c.push(10);
//        c.push(10);
//        c.push(13939);
//        c.push(111);
//        c.push(111);
//        c.push(111);
//        int i=0;
//        while (i<10) {
//            System.out.println(c.pop());
//            i++;
//        }

        CustomQueue queue= new CustomQueue();
        queue.add(37);
        queue.add(837);
        queue.add(1);
        queue.add(35);
        queue.add(32);

        queue.display();
        System.out.println(queue.front());




    }
}
