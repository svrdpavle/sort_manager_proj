package sort_manager.sorters.binary_tree_sort.binary_tree;

/*
Node class for a binary tree
 */

/**
 * Class for the node(s) to be used for a binary tree
 */
public class Node {
    private final int value;
    private Node leftChild;
    private Node rightChild;

    /**
     * Value of the node
     * @param value the value the node will hold
     */
    public Node(int value) {
        this.value = value;
    }

    /**
     * Get the value that is contained in the node
     * @return value found in the node
     */
    public int getValue() {
        return value;
    }

    /**
     * Get the left child of the current node
     * @return left child node
     */
    public Node getLeftChild() {
        return leftChild;
    }

    /**
     * Set the left child node to the parameter passed through
     * @param leftChild left child node
     */
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * Get the right child of the current node
     * @return right child node
     */
    public Node getRightChild() {
        return rightChild;
    }

    /**
     * Set the right child node to the parameter passed through
     * @param rightChild right child node
     */
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * Check if the left child node is empty
     * @return true or false depending on if the node is empty
     */
    public boolean isLeftChildEmpty() {
        if (leftChild == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check if the right child node is empty
     * @return true or false depending on if the node is empty
     */
    public boolean isRightChildEmpty() {
        if (rightChild == null) {
            return true;
        } else {
            return false;
        }
    }
}
