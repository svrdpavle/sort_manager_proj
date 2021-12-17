package sort_manager.handlers.output_handler;

/*
 Class that manages any output - prints to the user
 */

import java.util.Arrays;

public class Printer {
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

    public static void printInputErrorMsg() {
        System.out.println("Please enter an integer.");
    }

    public static void printSorterSelectedMsg(String sorterName) {
        System.out.printf("%n> %s sorter has been selected%n", sorterName);
    }

    public static void printArrayMsg() {
        System.out.println("Enter the size of array you wish to generate: ");
    }

    public static void printResults(String sorterName, int[] inputArr, int[] outputArr, long timeTaken) {
        System.out.printf("%n< %s sorter was used >%n", sorterName);
        System.out.println("Before sorting: " + Arrays.toString(inputArr));
        System.out.println("After sorting: " + Arrays.toString(outputArr));
        System.out.println("Time taken to sort: " + timeTaken + " nanoseconds");
    }
}
