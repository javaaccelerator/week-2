package queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue("task1");
        queue.add("task2");
        queue.add("task3");
        queue.add("task4");
        queue.display();
    }
}
