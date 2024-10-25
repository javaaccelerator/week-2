package stack;


public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public Node pop() {
        if (isEmpty()) {
             throw new IllegalArgumentException("Stack is empty");
        }
        Node tempNode = top;
        top = top.next;
        return tempNode;
    }

    public Node peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Print stack contents
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
