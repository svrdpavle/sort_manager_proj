package sort_manager.sorters;

import sort_manager.sorters.binary_tree.BinaryTreeSearch;
import sort_manager.sorters.bubble_sort.BubbleSorter;
import sort_manager.sorters.merge_sort.MergeSorter;

public class SortFactory {
    public static Sorter sorterFactory(String sorter) {
        if ("BINARY_TREE".equals(sorter)) {
            return new BinaryTreeSearch();
        } else if ("BUBBLE".equals(sorter)) {
            return new BubbleSorter();
        } else if ("MERGE".equals(sorter)) {
            return new MergeSorter();
        } else {
            return null;
        }
    }
}
