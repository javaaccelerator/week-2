package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("10");
        stack.push("20");
        stack.push("30");

        System.out.println("Top element is: " + stack.peek());
        stack.printStack();

        System.out.println(stack.pop() + " popped from stack");
        stack.printStack();
    }
}
