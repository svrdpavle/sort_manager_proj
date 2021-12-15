package sort_manager.start;

import sort_manager.sorters.*;

public class SortFactory {
    public static Sorter sorterFactory(String sorter) {
        if ("BINARY_TREE".equals(sorter)) {
            return new BinaryTreeSort();
        } else if ("BUBBLE".equals(sorter)) {
            return new BubbleSort();
        } else if ("MERGE".equals(sorter)) {
            return new MergeSort();
        } else {
            return null;
        }
    }
}
