package sort_manager.handlers.output_handler;

import java.util.Arrays;

/**
 * This class handles any messages that are printed to the user
 */
public class Printer {
    /**
     * Prints an introduction message to the user
     * <p>
     *     Displays a menu of sorters the user can choose from including: Binary Tree Sorter, Bubble Sorter and Merge Sorter
     * </p>
     */
    public static void printIntroMsg() {
        System.out.println("Welcome to Sort Manager!");
        System.out.println("Here is a menu of sorters to choose from: ");
        System.out.printf("1. Binary Tree Sorter%n" +
                "2. Bubble Sorter%n" +
                "3. Merge Sorter%n");
    }

    /**
     * Prints a message to the user prompting them to enter a number with regard to the sorter menu
     */
    public static void printEnterSorterNumMsg() {
        System.out.println("Enter a sorter number: ");
    }

    /**
     * Prints a message to the user prompting them to enter a integer
     * <p>
     *     Acts as a error message if the user does not enter an integer
     * </p>
     */
    public static void printInputErrorMsg() {
        System.out.println("Please enter an integer.");
    }

    /**
     * Prints a message to the user displaying the sorter they have selected
     * @param sorterName string of the sorter that has been selected
     */
    public static void printSorterSelectedMsg(String sorterName) {
        System.out.printf("%n> %s sorter has been selected%n", sorterName);
    }

    /**
     * Prints a message prompting the user to enter a number to determine the size of array they wish to generate
     */
    public static void printArrayMsg() {
        System.out.println("Enter the size of array you wish to generate: ");
    }

    /**
     * Prints a message of the results
     * <p>
     *     The message printed includes: the name of the sorter,
     *     the randomly generated array, a sorted version of the generated array
     *     and the time taken by the sort algorithm to sort the randomly generated array
     * </p>
     * @param sorterName string of the sorter that has been selected
     * @param inputArr generated array of random integers
     * @param outputArr sorted array of the array that was inputted
     * @param timeTaken long of the time taken
     */
    public static void printResults(String sorterName, int[] inputArr, int[] outputArr, long timeTaken) {
        System.out.printf("%n< %s sorter was used >%n", sorterName);
        System.out.println("Before sorting: " + Arrays.toString(inputArr));
        System.out.println("After sorting: " + Arrays.toString(outputArr));
        System.out.println("Time taken to sort: " + timeTaken + " nanoseconds");
    }
}
