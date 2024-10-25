package queue;

public class Task {
    String data;
    Task next;

    Task(String data) {
        this.data = data;
        this.next = null;
    }
}
