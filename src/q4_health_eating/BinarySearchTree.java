package q4_health_eating;

public class BinarySearchTree<T extends Comparable<T>> implements BinaryTreeInterface<T> {

    //initialize the root node, and set it to null
    private BTNode<T> root;

    //constructor
    public BinarySearchTree() {
        root = null;
    }

    //check if the tree is empty
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    //add nodes into the tree
    @Override
    public void addNode(T data) {
        //recursively add the node
        root = addNodeRecursive(root, data);
    }

    public BTNode<T> addNodeRecursive(BTNode<T> currentNode, T data) {
        //if currentNode is empty, create a new node
        if (currentNode == null) {
            return new BTNode<>(data);
        }

        //if data <= the data of current node, the data goes left and call the function itself
        //if data > the data of current node, the data goes right and call the function itself
        if (data.compareTo(currentNode.data) <= 0) {
            currentNode.left = addNodeRecursive(currentNode.left, data);
        } else if (data.compareTo(currentNode.data) > 0) {
            currentNode.right = addNodeRecursive(currentNode.right, data);
        }

        return currentNode;
    }

    //count all the nodes
    @Override
    public int countNodes() {
        //recursively count nodes
        return countNodesRecursive(root);//start from the root
    }

    private int countNodesRecursive(BTNode<T> node) {
        //if the node is empty, then return 0
        if (node == null) {
            return 0;
        }
        //otherwise return 1 and continue to count the left side and the right side of the node
        //by recursively calling this function, until the node is empty, and add all the nodes that not empty
        return 1 + countNodesRecursive(node.left) + countNodesRecursive(node.right);
    }

    //find the best food product object (lowest rating) -- the most left node in the binary search tree
    @Override
    public T findBest() {
        BTNode<T> bestNode = findBestRecursive(root);//start finding from the root

        if (bestNode != null) {
            return bestNode.data;
        } else {
            return null;
        }
    }

    private BTNode<T> findBestRecursive(BTNode<T> node) {

        //if the node or the left of the node is empty (no left side child)
        if (node == null || node.left == null) {
            return node;
        }

        //continue searching in the left side of the current node
        return findBestRecursive(node.left);
    }

    //find the best food product object (lowest rating) -- the most right node in the binary search tree
    @Override
    public T findWorst() {
        BTNode<T> worstNode = findWorstRecursive(root);//start finding from the root

        if (worstNode != null) {
            return worstNode.data;
        } else {
            return null;
        }
    }

    private BTNode<T> findWorstRecursive(BTNode<T> node) {
        //if the node or the right side of the node is empty (no right side child)
        if (node == null || node.right == null) {
            return node;
        }
        //otherwise continue searching in the right side  
        return findWorstRecursive(node.right);
    }
    
}
