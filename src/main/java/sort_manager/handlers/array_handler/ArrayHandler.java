package sort_manager.handlers.array_handler;

import java.util.Random;

/**
 * This class handles methods used to create and manipulate arrays
 */
public class ArrayHandler {
    /**
     * Generates an array of random integers
     * @param size int to determine the size of the array
     * @return array of random integers
     */
    public static int[] randomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }
}
