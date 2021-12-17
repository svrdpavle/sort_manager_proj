package sort_manager.sorters.merge_sort;

import sort_manager.sorters.Sorter;

/**
 * This class uses merge sort to sort an array of integers into ascending order
 */
public class MergeSorter implements Sorter {
    /**
     * Calls a method to sort the array of integers passed through as a parameter
     * @param unsortedArr unsorted array
     * @return the array that was passed through but in ascending order
     */
    @Override
    public int[] sortArray(int[] unsortedArr) {
        return mergeSort(unsortedArr);
    }

    /**
     * First part of the merge sort algorithm
     * <p>
     *     Mid-index of the array is found and then recursion is used to split the array passed that was passed through into sub-arrays
     * </p>
     * @param inputArr
     * @return
     */
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

    /**
     * This merges the sub-arrays that have been created by the mergeSort() method
     * @param inputArr original array passed through as a parameter
     * @param leftHalf sub-array created from the values that are left of the inputted array's mid-index
     * @param rightHalf sub-array created from the values that are right of the inputted array's mid-index
     * @return array that has been sorted
     */
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
