package array;

public class Array {
    private String[] names;
    private int count;

    public Array(int size) {
        this.names = new String[size];
        this.count = 0;
    }

    public void add (String name) {
        if(count < names.length) {
            names[count] = name;
            count++;
        } else {
            throw new RuntimeException("Fail");
        }
    }

    public void delete (String name) {
        int index = search(name);
        if(index == -1) {
            throw new IllegalArgumentException("name doesnt exist");
        }
        for(int i = index; i < count; i++) {
            names[i] = names[i+1];
            if(i == index) {
                count--;
            }
        }
    }

    public void delete (int index){
        for(int i = index;i < count; i++) {
            names[i] = names[i+1];
            if(i == index) {
                count--;
            }
        }
    }

    public int search (String name) {
        for(int i = 0; i < count; i++) {
            if(names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String search (int index) {
        if(index < names.length) {
            return names[index];
        }
        throw new IllegalArgumentException("Index out of bounds");
    }

    public void display() {
        for(int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }
    }
}
