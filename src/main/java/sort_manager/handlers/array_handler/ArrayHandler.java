package sort_manager.handlers.array_handler;

import java.util.Random;

/*
Class that manages array methods
 */

public class ArrayHandler {
    public static int[] randomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }
}
