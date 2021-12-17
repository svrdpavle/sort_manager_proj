package sort_manager.sorters;

import sort_manager.sorters.binary_tree_search.BinaryTreeSearch;
import sort_manager.sorters.bubble_sort.BubbleSorter;
import sort_manager.sorters.merge_sort.MergeSorter;

public class SortFactory {
    public static Sorter sorterFactory(String sorter) {
        if ("Binary Tree".equals(sorter)) {
            return new BinaryTreeSearch();
        } else if ("Bubble".equals(sorter)) {
            return new BubbleSorter();
        } else if ("Merge".equals(sorter)) {
            return new MergeSorter();
        } else {
            return null;
        }
    }

    public static Sorter getSorter(int n) {
        if (n == 1) {
            return sorterFactory("Binary Tree");
        } else if (n == 2) {
            return sorterFactory("Bubble");
        } else if (n == 3) {
            return  sorterFactory("Merge");
        } else {
            return null;
        }
    }
}
