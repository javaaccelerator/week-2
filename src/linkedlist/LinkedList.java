package linkedlist;

public class LinkedList {
    Node head;
    int size;

    public LinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public void add(int data) {
        Node newData = new Node(data);
        if(this.head.getNext() == null) {
            this.head.setNext(newData);
        }
        else {
            Node tempNode = head;
            for(int i = 0; i < size ; i ++)  {
                try {
                    Node currentNode = tempNode.getNext();
                    if(currentNode != null) {
                        tempNode = currentNode;
                    }
                } catch (Exception e) {
                    break;
                }
            }
            tempNode.setNext(newData);
        }
    }

    public void insert(int index, int data) {
        if(index < 0) {
            throw new IllegalArgumentException("Index can not be negative");
        }
        else if(index == 0) {
            Node tempNode = head;
            head = new Node(data);
            head.setNext(tempNode);
        }
        else if(index + 1 == size){
            Node tempNode = get(index-1);
            tempNode.setNext(new Node(data));
        }
        else{
            Node beforeNode = get(index-1);
            Node nodeToDelete = beforeNode.getNext();
            beforeNode.setNext(nodeToDelete.getNext());
        }
    }

    public Node get(int index) {
        Node node = this.head;
        for(int i = 0; i < size ; i ++)  {
            if(i == index) {
                break;
            }
            node = node.getNext();
        }
        return node;
    }

    public int search(int integer) {
        Node node = this.head;
        for(int i = 0; i < size ; i ++)  {
            if(integer == node.getData()) {
                return i;
            }
            node = node.getNext();
        }
        throw new RuntimeException("integer wasn't found");
    }

    public void delete (int index) {
        if(index == 0) {
            head = head.getNext();
        }
        else if(index + 1 == size){
            Node tempNode = get(index-1);
            tempNode.removeNext();
        } else {
            Node beforeNode = get(index-1);
            Node nodeToDelete = beforeNode.getNext();
            beforeNode.setNext(nodeToDelete.getNext());
        }
    }
    public void displayData () {
        Node displayNode = this.head;
        for(int i = 0; i < size; i ++)  {
            System.out.println(displayNode.getData());
            displayNode = displayNode.getNext();
        }
    }
}
