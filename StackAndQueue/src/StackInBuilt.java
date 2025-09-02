import java.util.Stack;

public class StackInBuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();//Stack is a class which uses genrics
        stack.push(12);
        stack.push(34);
        stack.push(25);
        stack.push(3);
        stack.push(234);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
//stack is like plates at wedding which are placed one on another
// so everyone takes the upper plate only
// but when we finish the food we place the last plate first