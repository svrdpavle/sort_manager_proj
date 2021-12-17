package sort_manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.sorters.SortFactory;
import sort_manager.sorters.Sorter;

import java.util.Arrays;

public class ArrayHandlerTests {
    Sorter binaryTreeSorter = SortFactory.sorterFactory("Binary Tree");
    Sorter bubbleSorter = SortFactory.sorterFactory("Bubble");
    Sorter mergeSorter = SortFactory.sorterFactory("Merge");
    int[] largeUnsortedArr = ArrayHandler.randomArray(10000);
    int[] positiveArr = {1, 7, 4, 6, 3, 9, 2, 8, 10, 5};
    int[] positiveArrSorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Binary Tree sorter tests
    @Nested
    @DisplayName("Binary Tree Sorter Tests")
    class binaryTreeSorterTests {
        @Test
        @DisplayName("Sorts large array")
        void sortsLargeArr() {
            int[] myBinaryTreeSortedArr = binaryTreeSorter.sortArray(largeUnsortedArr);
            Arrays.sort(largeUnsortedArr);
            Assertions.assertArrayEquals(largeUnsortedArr, myBinaryTreeSortedArr);
        }

        @Test
        @DisplayName("Sorts positive array of ints")
        void sortsPositiveArrOfInts() {
            Assertions.assertArrayEquals(positiveArrSorted, binaryTreeSorter.sortArray(positiveArr));
        }
    }

    // Bubble sorter tests
    @Nested
    @DisplayName("Bubble Sorter Tests")
    class bubbleSorterTests {
        @Test
        @DisplayName("Sorts large array")
        void sortsLargeArr() {
            int[] myBubbleSortedArr = bubbleSorter.sortArray(largeUnsortedArr);
            Arrays.sort(largeUnsortedArr);
            Assertions.assertArrayEquals(largeUnsortedArr, myBubbleSortedArr);
        }

        @Test
        @DisplayName("Sorts positive array of ints")
        void sortsPositiveArrOfInts() {
            Assertions.assertArrayEquals(positiveArrSorted, bubbleSorter.sortArray(positiveArr));
        }
    }

    // Merge sorter tests
    @Nested
    @DisplayName("Merge Sorter Tests")
    class mergeSorterTests {
        @Test
        @DisplayName("Sorts large array")
        void sortsLargeArr() {
            int[] myMergeSortedArr = mergeSorter.sortArray(largeUnsortedArr);
            Arrays.sort(largeUnsortedArr);
            Assertions.assertArrayEquals(largeUnsortedArr, myMergeSortedArr);
        }

        @Test
        @DisplayName("Sorts positive array of ints")
        void sortsPositiveArrOfInts() {
            Assertions.assertArrayEquals(positiveArrSorted, mergeSorter.sortArray(positiveArr));
        }
    }

}
