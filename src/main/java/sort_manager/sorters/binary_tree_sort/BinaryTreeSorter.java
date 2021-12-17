package sort_manager.sorters.binary_tree_sort;

/*
Class that uses binary tree sort to sort an array of integers into ascending order
 */

import sort_manager.sorters.Sorter;
import sort_manager.sorters.binary_tree_sort.binary_tree.BinaryTree;

public class BinaryTreeSorter implements Sorter {

    @Override
    public int[] sortArray(int[] unsortedArr) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addElements(unsortedArr);
        return binaryTree.getSortedTreeAsc();
    }
}
