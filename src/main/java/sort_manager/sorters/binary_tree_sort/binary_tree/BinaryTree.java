package sort_manager.sorters.binary_tree_sort.binary_tree;

import java.util.ArrayList;

/**
 * This class handles the creation of a binary tree
 */
public class BinaryTree implements BinaryTreeInterface {
    private Node rootNode;
    private int counter;

    public BinaryTree() {
        this.rootNode = null;
    }

    /**
     * Gets the element found in the root node
     * @return root node element
     */
    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    /**
     * Gets the number of elements in the binary tree
     * @return number of elements in the binary tree
     */
    @Override
    public int getNumberOfElements() {
        return counter;
    }

    /**
     * Adds a single element to the binary tree
     * @param element value to be added to the binary tree
     */
    @Override
    public void addElement(final int element) {
        if (rootNode == null) {
            this.rootNode = new Node(element);
        } else {
            addNodeToTree(rootNode, element);
            counter++;
        }
    }

    /**
     * Adds elements to the binary tree using the addElement() method
     * @param elements array of integers to be added to the binary tree
     */
    @Override
    public void addElements(final int[] elements) {
        for (int elem: elements) {
            addElement(elem);
        }
    }

    /**
     * Find a single element in the binary tree
     * @param value the int that is being searched for
     * @return true or false depending on if the element has been found in the binary tree
     */
    @Override
    public boolean findElement(int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

    /**
     * Sorts the elements in the binary tree into ascending order
     * @return the binary tree as an array of integers in ascending order
     */
    @Override
    public int[] getSortedTreeAsc() {
        ArrayList<Integer> elements = new ArrayList<>();
        elements = getSortedTreeAsc(rootNode, elements);
        int[] binaryTreeArr = new int[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            binaryTreeArr[i] = elements.get(i);
        }
        return binaryTreeArr;
    }

    /**
     * Recursion to traverse through the binary tree and retrieve the elements
     * @param newNode node of the binary tree
     * @param elements array list of elements found in the binary tree
     * @return elements found in the binary tree
     */
    private ArrayList<Integer> getSortedTreeAsc(Node newNode, ArrayList<Integer> elements) {
        if (newNode == null) {
            return elements;
        }
        getSortedTreeAsc(newNode.getLeftChild(), elements);
        elements.add(newNode.getValue());
        getSortedTreeAsc(newNode.getRightChild(),elements);

        return elements;
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }

    /**
     * Find a specific node in the binary tree
     * @param element value that is being searched
     * @return the node if the element is present in the array or null if the value cannot be found in the nodes of the binary tree
     */
    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            } else if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    /**
     * Add new nodes to the binary tree
     * @param node node to be added to the binary tree
     * @param element value that the node will contain
     */
    private void addNodeToTree(Node node, final int element) {
        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                // recursion
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element >= node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
            } else {
                // recursion
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }
}
