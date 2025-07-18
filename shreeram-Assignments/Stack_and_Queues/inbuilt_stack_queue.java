import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inbuilt_stack_queue {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        int i=0;
        while (i<10){
            stack.push(i+1);
            i++;
        }

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(8);
        queue.add(4);
        queue.add(2);




    }
}
