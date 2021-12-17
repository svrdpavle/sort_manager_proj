package sort_manager.sorters;

/*
Class that manages the 3 sorters
 */

import sort_manager.sorters.binary_tree_sort.BinaryTreeSorter;
import sort_manager.sorters.bubble_sort.BubbleSorter;
import sort_manager.sorters.merge_sort.MergeSorter;

public class SortFactory {
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
