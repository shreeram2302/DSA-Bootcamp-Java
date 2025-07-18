public class CircularQueue {

    protected int[] data;
    private int front=0;
    private int back=0;

    public CircularQueue() {
        this(5);
    }
    public CircularQueue(int size) {
        data= new int[size];
    }

    public boolean add(int val) throws Exception {

        if (isFull()){
            throw new Exception("Queue is full Can't insert");
        }

        back++;
        data[back%5]=val;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front++];
    }

    public boolean isFull(){
//        System.out.println(front);
//        System.out.println(back);

        return front==back && front==-1;
//        return false;
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public static void main(String[] args) throws Exception {
        CircularQueue cq= new CircularQueue();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6);
        cq.add(7);
        cq.add(8);
        System.out.println(cq.front);
        System.out.println(cq.remove());
        System.out.println(cq.front);
        System.out.println(cq.remove());
    }
}
