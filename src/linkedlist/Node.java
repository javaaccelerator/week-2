package linkedlist;

public class Node {
    private int data;
    private Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getNext() {
        try {
            return this.next;
        } catch (Exception e) {
            throw new RuntimeException("Reached End");
        }
    }

    public int getData() {
        return this.data;
    }

    public void removeNext() {
        next = null;
    }
}
