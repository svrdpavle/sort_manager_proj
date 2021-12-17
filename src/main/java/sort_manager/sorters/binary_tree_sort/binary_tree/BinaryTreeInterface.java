package sort_manager.sorters.binary_tree_sort.binary_tree;

/*
Specifies methods needed for the binary tree class
 */

public interface BinaryTreeInterface {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    //int getLeftChild(int element) throws ChildNotFoundException;

    //int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
