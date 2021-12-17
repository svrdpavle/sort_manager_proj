package sort_manager.sorters.bubble_sort;

import sort_manager.sorters.Sorter;

/**
 * This class uses bubble sort to sort an array of integers into ascending order
 */
public class BubbleSorter implements Sorter {
    /**
     * Calls a method to sort the array of integers passed through as a parameter
     * @param unsortedArr unsorted array
     * @return the array that was passed through but in ascending order
     */
    @Override
    public int[] sortArray(int[] unsortedArr) {
        return bubbleSort(unsortedArr);
    }

    /**
     * Using bubble sort algorithm, the array passed through as a parameter is sorted into ascending order
     * @param inputArr unsorted array
     * @return the array that was passed through but in ascending order
     */
    private int[] bubbleSort(int[] inputArr) {
        int[] bubbleSortArr = inputArr.clone();
        int temp = 0;
        for (int i = 0; i < bubbleSortArr.length; i++) {
            for (int j = 1; j < ((bubbleSortArr.length) - i); j++) {
                if (bubbleSortArr[j-1] > bubbleSortArr[j]) {
                    temp = bubbleSortArr[j-1];
                    bubbleSortArr[j-1] = bubbleSortArr[j];
                    bubbleSortArr[j] = temp;
                }
            }
        }
        return bubbleSortArr;
    }
}
