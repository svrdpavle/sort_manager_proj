package sort_manager.managers;

// Class that manages any output

public class OutputManager {
    public static void printIntroMsg() {
        System.out.println("Welcome to Sort Manager!");
        System.out.println("Here is a menu of sorters to choose from: ");
        System.out.printf("1. Binary Tree Sorter%n" +
                "2. Bubble Sorter%n" +
                "3. Merge Sorter%n");
    }

    public static void printEnterSorterNumMsg() {
        System.out.println("Enter a sorter number: ");
    }

    public static void printArrayMsg() {
        System.out.println("Enter the size of array you wish to generate: ");
    }

    public static void printResults() {
        System.out.println("Sorting using the ");
        System.out.println("Before sorting: ");
        System.out.println("After sorting: ");
        System.out.println("Time taken: ");
    }
}
