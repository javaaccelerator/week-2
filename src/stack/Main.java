package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("10");
        stack.push("+");
        stack.push("35");
        stack.push("/");
        stack.push("30");
        System.out.println(Calculator.resolve(stack));
    }
}
