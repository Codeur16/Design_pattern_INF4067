import com.adapter.DListImpStack;
import com.Stack.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new DListImpStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print(); // 1 2 3 4
        System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Top: " + stack.top());
        stack.print();
    }
}