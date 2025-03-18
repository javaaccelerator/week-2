package linearsearch;

public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();

        // Example array
        int[] array = {3, 5, 2, 7, 9, 1, 4};

        // Test cases
        int target1 = 7;  // Present in the array
        int target2 = 10; // Not present in the array

        System.out.println("Searching for " + target1 + " in the array:");
        int result1 = linearSearch.search(array, target1);
        if (result1 != -1) {
            System.out.println(target1 + " found at index " + result1);
        } else {
            System.out.println(target1 + " not found in the array");
        }

        System.out.println("\nSearching for " + target2 + " in the array:");
        int result2 = linearSearch.search(array, target2);
        if (result2 != -1) {
            System.out.println(target2 + " found at index " + result2);
        } else {
            System.out.println(target2 + " not found in the array");
        }

        // Optional: Display the array for clarity
        System.out.println("\nArray contents:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
