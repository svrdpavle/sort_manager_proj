package sort_manager;

import org.junit.jupiter.api.*;
import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.sorters.SortFactory;
import sort_manager.sorters.Sorter;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SorterTests {
    /*
     1 -> Binary Tree sorter
     2 -> Bubble sorter
     3 -> Merge sorter
     */
    Sorter sorter = SortFactory.getSorter(3);

    int[] largeUnsortedArr = ArrayHandler.randomArray(10000);

    int[] positiveArr = {1, 7, 4, 6, 3, 9, 2, 8, 10, 5};
    int[] positiveArrSorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[] negativeArr = {-1, -7, -4, -6, -3, -9, -2, -8, -10, -5};
    int[] negativeArrSorted = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1};

    int[] alreadySortedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[] oneElementArr = {1};

    int[] oddSizedArr = {2, 5, 3, 1, 4};
    int[] oddSizedArrSorted = {1, 2, 3, 4, 5};

    int[] duplicateArr = {5, 2, 3, 4, 5, 1, 3, 1, 2, 4};
    int[] duplicateArrSorted = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

    @BeforeAll
    static void beforeAll(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> executing");
    }

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> is being tested");
    }

    // Binary Tree sorter tests
    @Nested
    @DisplayName("Sorter Tests")
    class binaryTreeSorterTests {
        @Test
        @DisplayName("Sorts large array")
        void sortsLargeArr() {
            int[] myBinaryTreeSortedArr = sorter.sortArray(largeUnsortedArr);
            Arrays.sort(largeUnsortedArr);
            assertArrayEquals(largeUnsortedArr, myBinaryTreeSortedArr);
        }

        @Test
        @DisplayName("Sorts positive array")
        void sortsPositiveArr() {
            assertArrayEquals(positiveArrSorted, sorter.sortArray(positiveArr));
        }

        @Test
        @DisplayName("Sorts negative array")
        void sortsNegativeArr() {
            assertArrayEquals(negativeArrSorted, sorter.sortArray(negativeArr));
        }

        @Test
        @DisplayName("Sorts sorted array")
        void sortsSortedArr() {
            assertArrayEquals(alreadySortedArr, sorter.sortArray(alreadySortedArr));
        }

        @Test
        @DisplayName("Sorts one element array")
        void sortsOneElementArr() {
            assertArrayEquals(oneElementArr, sorter.sortArray(oneElementArr));
        }

        @Test
        @DisplayName("Sorts odd sized array")
        void sortsOddSizedArr() {
            assertArrayEquals(oddSizedArrSorted, sorter.sortArray(oddSizedArr));
        }

        // Note: Test will fail when using the Binary Tree Sorter as a binary tree cannot have duplicate values
        @Test
        @DisplayName("Sorts duplicate array")
        void sortsDuplicateArr() {
            assertArrayEquals(duplicateArrSorted, sorter.sortArray(duplicateArr));
        }
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> has finished testing");
    }

    @AfterAll
    static void afterAll(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> completed");
    }
}
