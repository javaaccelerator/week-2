package linkedlist;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public LinkedList(Node head) {
        this.head = head;
        this.size = calculateSize(); // Safety measure
    }

    private int calculateSize() {
        int count = 0;
        Node current = head;
        while(current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node last = get(size - 1);
            last.setNext(newNode);
        }
        size++;
    }

    public void insert(int index, int data) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node newNode = new Node(data);

        if(index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node prev = get(index - 1);
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
        }
        size++;
    }

    public Node get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node current = head;
        for(int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public int search(int target) {
        Node current = head;
        int index = 0;
        while(current != null) {
            if(current.getData() == target) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        throw new RuntimeException("Value not found: " + target);
    }

    public void delete(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if(index == 0) {
            head = head.getNext();
        } else {
            Node prev = get(index - 1);
            Node toDelete = prev.getNext();
            prev.setNext(toDelete.getNext());
        }
        size--;
    }

    public void displayData() {
        Node current = head;
        while(current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public int size() {
        return size;
    }
}
