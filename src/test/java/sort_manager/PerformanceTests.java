package sort_manager;

/*
Performance tests for all 3 sorters; comparison of how long it takes for each sorter to sort a large array of random ints
 */

import org.junit.jupiter.api.*;
import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.handlers.output_handler.Printer;
import sort_manager.sorters.Sorter;
import sort_manager.sorters.binary_tree_sort.BinaryTreeSorter;
import sort_manager.sorters.bubble_sort.BubbleSorter;
import sort_manager.sorters.merge_sort.MergeSorter;
import sort_manager.utils.Timer;

public class PerformanceTests {
    Timer timer = new Timer();
    Sorter binaryTreeSorter = new BinaryTreeSorter();
    Sorter bubbleSorter = new BubbleSorter();
    Sorter mergeSorter = new MergeSorter();
    int[] largeUnsortedArr = ArrayHandler.randomArray(10000);

    @BeforeAll
    static void beforeAll(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> executing");
    }

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("<" + testInfo.getDisplayName() + "> is being tested");
    }

    @Nested
    @DisplayName("Sorter Performance Tests")
    class sorterPerformanceTests {
        @Test
        @DisplayName("Test Binary Tree Sorter")
        void testBinaryTreeSorter() {
            timer.setStartTime(System.nanoTime());
            int[] sortedArr = binaryTreeSorter.sortArray(largeUnsortedArr);
            timer.setEndTime(System.nanoTime());
            Printer.printResults("Binary Tree Sorter", largeUnsortedArr, sortedArr, timer.getTimeDiff());
        }

        @Test
        @DisplayName("Test Bubble Sorter")
        void testBubbleSorter() {
            timer.setStartTime(System.nanoTime());
            int[] sortedArr = bubbleSorter.sortArray(largeUnsortedArr);
            timer.setEndTime(System.nanoTime());
            Printer.printResults("Binary Tree Sorter", largeUnsortedArr, sortedArr, timer.getTimeDiff());
        }

        @Test
        @DisplayName("Test Merge Sorter")
        void testMergeSorter() {
            timer.setStartTime(System.nanoTime());
            int[] sortedArr = mergeSorter.sortArray(largeUnsortedArr);
            timer.setEndTime(System.nanoTime());
            Printer.printResults("Merge Sorter", largeUnsortedArr, sortedArr, timer.getTimeDiff());
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
