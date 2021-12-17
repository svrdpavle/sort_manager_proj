package sort_manager.sorters.binary_tree_search.binary_tree;

import java.util.ArrayList;

public class BinaryTree implements BinaryTreeInterface {
    private Node rootNode;
    private int counter;

    public BinaryTree() {
        this.rootNode = null;
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return counter;
    }

    @Override
    public void addElement(final int element) {
        if (rootNode == null) {
            this.rootNode = new Node(element);
        } else {
            addNodeToTree(rootNode, element);
            counter++;
        }
    }

    @Override
    public void addElements(final int[] elements) {
        for (int elem: elements) {
            addElement(elem);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

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
