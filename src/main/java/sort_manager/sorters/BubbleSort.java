package sort_manager.sorters;

// Class that uses bubble sort to sort an array of integers into ascending order

public class BubbleSort implements Sorter {
    @Override
    public int[] sortArray(int[] unsortedArr) {
        return bubbleSort(unsortedArr);
    }

    // bubble sort algorithm
    private int[] bubbleSort(int[] generatedArr) {
        int[] bubbleSortArr = new int[generatedArr.length];
        for (int i = 0; i < generatedArr.length; i++) {
            bubbleSortArr[i] = generatedArr[i];
        }
        return bubbleSortArr;
    }
}
