public class CustomQueue {

    protected int[] data;
    private int pointer=0;
    int p=0;



    public CustomQueue() {
        this(10);
    }

    public CustomQueue(int data) {
        this.data = new int[data];
    }

    public boolean add(int val){
        if (isFull()){
            System.out.println("Queue is full cant Add element");
            return false;
        }
        data[pointer++]=val;
        return true;

    }

    public int remove(){
        if (isEmpty()){
            System.out.println("Queue is Empty cant remove element");
        }
        int removed=data[0];

        for (int i = 1; i < pointer; i++) {
            data[i-1]=data[i];
        }
        pointer--;
        return removed;
    }


    public int front(){
        if (isEmpty()){
            System.out.println("Queue is Empty cant get peek element");
        }
        return data[0];
    }

    public boolean isEmpty() {
    return pointer==-1;
    }

    public boolean isFull() {
    return pointer==data.length-1;
    }

    void display(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" <- ");
        }

        System.out.println();
    }


}
