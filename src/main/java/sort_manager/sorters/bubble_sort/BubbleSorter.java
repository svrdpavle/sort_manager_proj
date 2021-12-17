package sort_manager.sorters.bubble_sort;

/*
Class that uses bubble sort to sort an array of integers into ascending order
 */

import sort_manager.sorters.Sorter;

public class BubbleSorter implements Sorter {
    @Override
    public int[] sortArray(int[] unsortedArr) {
        return bubbleSort(unsortedArr);
    }

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
