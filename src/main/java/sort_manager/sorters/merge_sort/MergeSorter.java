package sort_manager.sorters.merge_sort;

/*
Class that uses merge sort to sort an array of integers into ascending order
 */

import sort_manager.sorters.Sorter;

public class MergeSorter implements Sorter {
    @Override
    public int[] sortArray(int[] unsortedArr) {
        return mergeSort(unsortedArr);
    }

    private int[] mergeSort(int[] inputArr) {
        int inputLength = inputArr.length;

        if (inputLength < 2) {
            return inputArr;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArr[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        return merge(inputArr, leftHalf, rightHalf);
    }

    private int[] merge (int[] inputArr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArr[k] = leftHalf[i];
                i++;
            }
            else {
                inputArr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArr[k] = rightHalf[j];
            j++;
            k++;
        }

        return inputArr;
    }
}
