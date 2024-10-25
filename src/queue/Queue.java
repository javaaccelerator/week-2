package queue;

public class Queue {
    Task first;

    public Queue(String first) {
        this.first = new Task(first);
    }

    public void add(String task) {
        Task currentTask = this.first;
        while(true) {
            if(currentTask.next == null) {
                currentTask.next = new Task(task);
                break;
            }
            currentTask = currentTask.next;
        }
    }

    public void remove() {
        if(first.next != null) {
            first = first.next;
        } else {
            first = null;
        }
    }

    public void display() {
        Task currentTask = this.first;
        while(true) {
            if(currentTask.next == null) {
                System.out.println(currentTask.data);
                break;
            }
            System.out.println(currentTask.data);
            currentTask = currentTask.next;
        }
    }

}
