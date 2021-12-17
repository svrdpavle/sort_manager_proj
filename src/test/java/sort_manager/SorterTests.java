package sort_manager;

/*
Tests for the 3 sorter classes
 */

import org.junit.jupiter.api.*;
import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.sorters.SortFactory;
import sort_manager.sorters.Sorter;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class produces 7 specific tests to test against the sorters
 */
public class SorterTests {
    Sorter sorter = SortFactory.getSorter(2);

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

    /**
     * Prints a message to indicate the start of all the testing
     * @param testInfo information of the specified test
     */
    @BeforeAll
    static void beforeAll(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> executing");
    }

    /**
     * Prints a message for each test to show it is being tested
     * @param testInfo information of the specified test
     */
    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> is being tested");
    }

    /**
     * Nested class of all the sorter tests
     */
    @Nested
    @DisplayName("Sorter Tests")
    class binaryTreeSorterTests {
        /**
         * Tests the sorter can sort a large array of integers (10,000 values)
         */
        @Test
        @DisplayName("Sorts large array")
        void sortsLargeArr() {
            int[] myBinaryTreeSortedArr = sorter.sortArray(largeUnsortedArr);
            Arrays.sort(largeUnsortedArr);
            assertArrayEquals(largeUnsortedArr, myBinaryTreeSortedArr);
        }

        /**
         * Tests the sorter can sort a positive array of integers
         */
        @Test
        @DisplayName("Sorts positive array")
        void sortsPositiveArr() {
            assertArrayEquals(positiveArrSorted, sorter.sortArray(positiveArr));
        }

        /**
         * Tests the sorter can sort a negative array of integers
         */
        @Test
        @DisplayName("Sorts negative array")
        void sortsNegativeArr() {
            assertArrayEquals(negativeArrSorted, sorter.sortArray(negativeArr));
        }

        /**
         * Tests the sorter can sort a sorted array of integers
         */
        @Test
        @DisplayName("Sorts sorted array")
        void sortsSortedArr() {
            assertArrayEquals(alreadySortedArr, sorter.sortArray(alreadySortedArr));
        }

        /**
         * Tests the sorter can sort a single element array
         */
        @Test
        @DisplayName("Sorts one element array")
        void sortsOneElementArr() {
            assertArrayEquals(oneElementArr, sorter.sortArray(oneElementArr));
        }

        /**
         * Tests the sorter can sort an odd sized array of integers
         */
        @Test
        @DisplayName("Sorts odd sized array")
        void sortsOddSizedArr() {
            assertArrayEquals(oddSizedArrSorted, sorter.sortArray(oddSizedArr));
        }

        /**
         * Tests the sorter can sort an array of integers that contains duplicates
         */
        @Test
        @DisplayName("Sorts duplicate array")
        void sortsDuplicateArr() {
            assertArrayEquals(duplicateArrSorted, sorter.sortArray(duplicateArr));
        }
    }

    /**
     * Prints a message for each test to show it has finished testing
     * @param testInfo information of the specified test
     */
    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> has finished testing");
    }

    /**
     * Prints a message to indicate the end of all the testing
     * @param testInfo information of the specified test
     */
    @AfterAll
    static void afterAll(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> completed");
    }
}
