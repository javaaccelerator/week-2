package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList names = new LinkedList(new Node(0),4);
        names.add(1);
        names.add(2);
        names.add(3);
        names.add(4);
        names.displayData();
        names.insert(3,5);
        names.displayData();
        System.out.println(names.search(1));
    }
}
