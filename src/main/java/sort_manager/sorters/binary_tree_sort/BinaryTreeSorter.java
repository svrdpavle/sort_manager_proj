package sort_manager.sorters.binary_tree_sort;

import sort_manager.sorters.Sorter;
import sort_manager.sorters.binary_tree_sort.binary_tree.BinaryTree;

/**
 * This class uses binary tree sort to sort an array of integers into ascending order
 * <p>
 *     Implements the sorter interface
 * </p>
 */
public class BinaryTreeSorter implements Sorter {

    /**
     * Calls various methods to sort the array of integers passed through as a parameter
     * @param unsortedArr unsorted array
     * @return the array that was passed through but in ascending order
     */
    @Override
    public int[] sortArray(int[] unsortedArr) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addElements(unsortedArr);
        return binaryTree.getSortedTreeAsc();
    }
}
