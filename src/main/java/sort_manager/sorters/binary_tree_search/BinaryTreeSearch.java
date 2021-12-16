package sort_manager.sorters.binary_tree_search;

import sort_manager.sorters.Sorter;
import sort_manager.sorters.binary_tree_search.binary_tree.BinaryTree;

public class BinaryTreeSearch implements Sorter {

    @Override
    public int[] sortArray(int[] unsortedArr) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addElements(unsortedArr);
        return binaryTree.getSortedTreeAsc();
    }
}
