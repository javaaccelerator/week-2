package binarysearch;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Test cases
        int target1 = 9;  // Present in the array
        int target2 = 10; // Not present in the array

        System.out.println("Searching for " + target1 + " in the array:");
        int result1 = binarySearch.search(sortedArray, target1);
        if (result1 != -1) {
            System.out.println(target1 + " found at index " + result1);
        } else {
            System.out.println(target1 + " not found in the array");
        }

        System.out.println("\nSearching for " + target2 + " in the array:");
        int result2 = binarySearch.search(sortedArray, target2);
        if (result2 != -1) {
            System.out.println(target2 + " found at index " + result2);
        } else {
            System.out.println(target2 + " not found in the array");
        }
    }
}

