package sort_manager.managers;

// Class that manages any output

public class OutputManager {
    public static void printIntroMsg() {
        System.out.println("Welcome to Sort Manager!");
        System.out.println("Please enter the number of the sorter you wish to use:");
        System.out.printf("1. Binary Tree Sorter%n" +
                "2. Bubble Sorter%n" +
                "3. Merge Sorter");
    }

    public static void printArrayMsg() {
        System.out.println("Please enter the size of array you wish to generate: ");
    }

    public static void printResults() {
        System.out.println("Sorting using the ");
        System.out.println("Before sorting: ");
        System.out.println("After sorting: ");
        System.out.println("Time taken: ");
    }
}
