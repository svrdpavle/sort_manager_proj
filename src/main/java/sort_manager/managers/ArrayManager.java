package sort_manager.managers;

import java.util.Random;

public class ArrayManager {
    // method to generate a random array
    public static int[] randomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (rand.nextInt(size) + 1);
        }
        return arr;
    }
}
