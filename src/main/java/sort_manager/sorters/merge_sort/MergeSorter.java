package sort_manager.sorters.merge_sort;

/*
Class that uses merge sort to sort an array of integers into ascending order
Links used to help with the algorithm:
- https://www.youtube.com/watch?v=bOk35XmHPKs&t=377s
- https://www.geeksforgeeks.org/merge-sort/
 */

import sort_manager.sorters.Sorter;

public class MergeSorter implements Sorter {
    @Override
    public int[] sortArray(int[] unsortedArr) {
        return mergeSort(unsortedArr);
    }

    // method to split the array into sub-arrays
    private int[] mergeSort(int[] inputArr) {
        int inputLength = inputArr.length;

        // when the array has a single value return the array
        // also prevents stackOverFlowError
        if (inputLength < 2) {
            return inputArr;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        // copy elements from input array to the left half (from 0 to midIndex)
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArr[i];
        }

        // copy elements from input array to the right half (from midIndex to the index of the last element)
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        return merge(inputArr, leftHalf, rightHalf);
    }

    // method to merge the sub-arrays
    private int[] merge (int[] inputArr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        /*
        i -> iterator for the left half
        j -> iterator for the right half
        k -> iterator for the merged array
         */
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

        // add remaining elements to merged array
        // if the remaining elements are in the left half
        while (i < leftSize) {
            inputArr[k] = leftHalf[i];
            i++;
            k++;
        }
        // if the remaining elements are in the right half
        while (j < rightSize) {
            inputArr[k] = rightHalf[j];
            j++;
            k++;
        }

        return inputArr;
    }
}
