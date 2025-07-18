public class CustomStack {
    protected int[] data;

    private final int default_size=10;
    private int pointer=-1;

    public CustomStack() {
        this.data = new int[default_size];
    }
    public CustomStack(int size) {
        this.data= new int[size];
    }

    public boolean push(int e) throws Exception {
       if (isFull()){
           throw new Exception("Stack is full");
       }
       else {
           pointer++;
           data[pointer] = e;
           return true;
       }
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Can't pop item stack is empty");
        }
        else {
            return data[pointer--];
        }
    }

    public int peek() throws Exception {
        if (isEmpty()){
            throw new Exception("Can't pop item stack is empty");
        }
        else {
            return data[pointer];
        }
    }
    public boolean isFull(){
       return pointer == data.length-1;
    }
    public boolean isEmpty(){
        return pointer == -1;
    }
}
