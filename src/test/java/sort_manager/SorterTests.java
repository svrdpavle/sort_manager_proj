package sort_manager;

import org.junit.jupiter.api.*;
import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.sorters.SortFactory;
import sort_manager.sorters.Sorter;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SorterTests {
    Sorter binaryTreeSorter = SortFactory.sorterFactory("Binary Tree");
    Sorter bubbleSorter = SortFactory.sorterFactory("Bubble");
    Sorter mergeSorter = SortFactory.sorterFactory("Merge");

    int[] largeUnsortedArr = ArrayHandler.randomArray(10000);

    int[] positiveArr = {1, 7, 4, 6, 3, 9, 2, 8, 10, 5};
    int[] positiveArrSorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[] negativeArr = {-1, -7, -4, -6, -3, -9, -2, -8, -10, -5};
    int[] negativeArrSorted = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1};

    int[] alreadySortedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[] oneElementArr = {1};

    int[] oddSizedArr = {2, 5, 3, 1, 4};
    int[] oddSizedArrSorted = {1, 2, 3, 4, 5};

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
    @DisplayName("Binary Tree Sorter Tests")
    class binaryTreeSorterTests {
        @Test
        @DisplayName("Sorts large array")
        void sortsLargeArr() {
            int[] myBinaryTreeSortedArr = binaryTreeSorter.sortArray(largeUnsortedArr);
            Arrays.sort(largeUnsortedArr);
            assertArrayEquals(largeUnsortedArr, myBinaryTreeSortedArr);
        }

        @Test
        @DisplayName("Sorts positive array")
        void sortsPositiveArr() {
            assertArrayEquals(positiveArrSorted, binaryTreeSorter.sortArray(positiveArr));
        }

        @Test
        @DisplayName("Sorts negative array")
        void sortsNegativeArr() {
            assertArrayEquals(negativeArrSorted, binaryTreeSorter.sortArray(negativeArr));
        }

        @Test
        @DisplayName("Sorts a sorted array")
        void sortsSortedArr() {
            assertArrayEquals(alreadySortedArr, binaryTreeSorter.sortArray(alreadySortedArr));
        }

        @Test
        @DisplayName("Sorts a one element array")
        void sortsOneElementArr() {
            assertArrayEquals(oneElementArr, binaryTreeSorter.sortArray(oneElementArr));
        }

        @Test
        @DisplayName("Sorts a odd sized array")
        void sortsOddSizedArr() {
            assertArrayEquals(oddSizedArrSorted, binaryTreeSorter.sortArray(oddSizedArr));
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
            assertArrayEquals(largeUnsortedArr, myBubbleSortedArr);
        }

        @Test
        @DisplayName("Sorts positive array")
        void sortsPositiveArr() {
            assertArrayEquals(positiveArrSorted, bubbleSorter.sortArray(positiveArr));
        }

        @Test
        @DisplayName("Sorts negative array")
        void sortsNegativeArr() {
            assertArrayEquals(negativeArrSorted, bubbleSorter.sortArray(negativeArr));
        }

        @Test
        @DisplayName("Sorts an already sorted array")
        void sortsSortedArr() {
            assertArrayEquals(alreadySortedArr, bubbleSorter.sortArray(alreadySortedArr));
        }

        @Test
        @DisplayName("Sorts a one element array")
        void sortsOneElementArr() {
            assertArrayEquals(oneElementArr, bubbleSorter.sortArray(oneElementArr));
        }

        @Test
        @DisplayName("Sorts a odd sized array")
        void sortsOddSizedArr() {
            assertArrayEquals(oddSizedArrSorted, bubbleSorter.sortArray(oddSizedArr));
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
            assertArrayEquals(largeUnsortedArr, myMergeSortedArr);
        }

        @Test
        @DisplayName("Sorts positive array")
        void sortsPositiveArr() {
            assertArrayEquals(positiveArrSorted, mergeSorter.sortArray(positiveArr));
        }

        @Test
        @DisplayName("Sorts negative array")
        void sortsNegativeArr() {
            assertArrayEquals(negativeArrSorted, mergeSorter.sortArray(negativeArr));
        }

        @Test
        @DisplayName("Sorts an already sorted array")
        void sortsSortedArr() {
            assertArrayEquals(alreadySortedArr, mergeSorter.sortArray(alreadySortedArr));
        }

        @Test
        @DisplayName("Sorts a one element array")
        void sortsOneElementArr() {
            assertArrayEquals(oneElementArr, mergeSorter.sortArray(oneElementArr));
        }

        @Test
        @DisplayName("Sorts a odd sized array")
        void sortsOddSizedArr() {
            assertArrayEquals(oddSizedArrSorted, mergeSorter.sortArray(oddSizedArr));
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
