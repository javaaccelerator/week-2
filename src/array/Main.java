package array;

public class Main {
    public static void main(String[] args) {
        Array names = new Array(4);
        names.add("Jacob");
        names.add("Baffour");
        names.add("Jerome");
        names.add("Kofi");
        names.display();
        names.delete("Jerome");
        names.delete(1);
        names.display();
        System.out.println(names.search("Kofi"));
        System.out.println(names.search(0));
    }
}
