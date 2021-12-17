package sort_manager.sorters;

import sort_manager.sorters.binary_tree_sort.BinaryTreeSorter;
import sort_manager.sorters.bubble_sort.BubbleSorter;
import sort_manager.sorters.merge_sort.MergeSorter;

/**
 * This class manages the 3 sorters and when they should be called upon
 */
public class SortFactory {
    /**
     * Depending on the parameter passed in, a sorter is returned
     * @param sorter string of the sorter name
     * @return sorter object to be used
     */
    public static Sorter sorterFactory(String sorter) {
        switch (sorter) {
            case "Binary Tree":
                return new BinaryTreeSorter();
            case "Bubble":
                return new BubbleSorter();
            case "Merge":
                return new MergeSorter();
            default:
                return null;
        }
    }

    /**
     * Get sorter by passing in an int in regard to the sorter menu
     * @param n corresponding value to the different sorters
     * @return string of the sorter name to be used for the sorterFactory method
     */
    public static Sorter getSorter(int n) {
        switch (n) {
            case 1:
                return sorterFactory("Binary Tree");
            case 2:
                return sorterFactory("Bubble");
            case 3:
                return sorterFactory("Merge");
            default:
                return null;
        }
    }
}
