package stack;

public class Calculator {
    Stack stack = new Stack();
    public int resolve (Stack stack) {
        int result = 0;
        while(true) {
            Node start = stack.pop();
            Node next = stack.pop();
            Node nextNext = stack.pop();
            result += solve(start,next);
            try{

            }catch (Exception e) {}
        }
    }

    public int solve(Node top, Node next) {
        return 0;
    }
}
