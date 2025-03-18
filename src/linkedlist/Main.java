package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.displayData();
        numbers.insert(3,5);
        numbers.displayData();
        System.out.println(numbers.search(1));
    }
}
