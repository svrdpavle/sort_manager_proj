package sort_manager;

import org.junit.jupiter.api.*;
import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.handlers.output_handler.Printer;
import sort_manager.sorters.Sorter;
import sort_manager.sorters.binary_tree_sort.BinaryTreeSorter;
import sort_manager.sorters.bubble_sort.BubbleSorter;
import sort_manager.sorters.merge_sort.MergeSorter;
import sort_manager.utils.Timer;

/**
 * This class produces performance tests for all 3 sorters
 * <p>
 *     Comparison of how long it takes for each sorter to sort a large array of random integers
 * </p>
 */
public class PerformanceTests {
    Timer timer = new Timer();
    Sorter binaryTreeSorter = new BinaryTreeSorter();
    Sorter bubbleSorter = new BubbleSorter();
    Sorter mergeSorter = new MergeSorter();
    int[] largeUnsortedArr = ArrayHandler.randomArray(10000);

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
     * Nested class of all the sorter performance tests
     */
    @Nested
    @DisplayName("Sorter Performance Tests")
    class sorterPerformanceTests {
        /**
         * Testing the binary tree sorter for its performance
         */
        @Test
        @DisplayName("Test Binary Tree Sorter")
        void testBinaryTreeSorter() {
            timer.setStartTime(System.nanoTime());
            int[] sortedArr = binaryTreeSorter.sortArray(largeUnsortedArr);
            timer.setEndTime(System.nanoTime());
            Printer.printResults("Binary Tree Sorter", largeUnsortedArr, sortedArr, timer.getTimeDiff());
        }

        /**
         * Testing the bubble sorter for its performance
         */
        @Test
        @DisplayName("Test Bubble Sorter")
        void testBubbleSorter() {
            timer.setStartTime(System.nanoTime());
            int[] sortedArr = bubbleSorter.sortArray(largeUnsortedArr);
            timer.setEndTime(System.nanoTime());
            Printer.printResults("Binary Tree Sorter", largeUnsortedArr, sortedArr, timer.getTimeDiff());
        }

        /**
         * Testing the merge sorter for its performance
         */
        @Test
        @DisplayName("Test Merge Sorter")
        void testMergeSorter() {
            timer.setStartTime(System.nanoTime());
            int[] sortedArr = mergeSorter.sortArray(largeUnsortedArr);
            timer.setEndTime(System.nanoTime());
            Printer.printResults("Merge Sorter", largeUnsortedArr, sortedArr, timer.getTimeDiff());
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
