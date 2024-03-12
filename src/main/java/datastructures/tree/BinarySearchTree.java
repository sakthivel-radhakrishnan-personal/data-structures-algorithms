package datastructures.tree;


import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements BinaryTree<T> {

    private BinaryTreeNode<T> root;

    BinarySearchTree() {
        this.root = null;
    }

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new BinaryTreeNode<>(data);
            return;
        }
        insertRecursive(root, new BinaryTreeNode<>(data));
    }

    @Override
    public BinaryTreeNode<T> search(T element) {
        return searchRecursive(root, element);
    }

    @Override
    public void delete(T element) {
        BinaryTreeNode<T> nodeToBeDeleted = search(element);

        if (isALeafNode(nodeToBeDeleted)) {

        }
    }

    @Override
    public List<BinaryTreeNode<T>> traverseInorder() {
        List<BinaryTreeNode<T>> list = new ArrayList<>();
        traverseInorderRecursive(root, list);
        return list;
    }

    @Override
    public boolean isBST() {
        return isBSTUtil(root, null, null);
    }

    private boolean isBSTUtil(BinaryTreeNode<T> node, T min, T max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.getData().compareTo(min) <= 0) || (max != null && node.getData().compareTo(max) >= 0)) {
            return false;
        }

        return isBSTUtil(node.getLeft(), min, node.getData()) && isBSTUtil(node.getRight(), node.getData(), max);
    }

    private void traverseInorderRecursive(BinaryTreeNode<T> root, List<BinaryTreeNode<T>> list) {
        if (root == null) {
            return;
        }
        traverseInorderRecursive(root.getLeft(), list);
        list.add(root);
        traverseInorderRecursive(root.getRight(), list);
    }

    private BinaryTreeNode<T> insertRecursive(BinaryTreeNode<T> root, BinaryTreeNode<T> newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }

        if (isNodeSmallerThanRoot(root, newNode)) {
            root.setLeft(insertRecursive(root.getLeft(), newNode));
        } else if (isNodeGreaterThanRoot(root, newNode)) {
            root.setRight(insertRecursive(root.getRight(), newNode));
        }
        return root;
    }

    private BinaryTreeNode<T> searchRecursive(BinaryTreeNode<T> node, T element) {
        if (node == null) {
            return null;
        }

        if (node.getData().equals(element)) {
            return node;
        } else if (element.compareTo(node.getData()) < 0) {
            return searchRecursive(node.getLeft(), element);
        } else {
            return searchRecursive(node.getRight(), element);
        }
    }

    private boolean isNodeSmallerThanRoot(BinaryTreeNode<T> root, BinaryTreeNode<T> newNode) {
        return newNode.getData().compareTo(root.getData()) < 0;
    }

    private boolean isNodeGreaterThanRoot(BinaryTreeNode<T> root, BinaryTreeNode<T> newNode) {
        return newNode.getData().compareTo(root.getData()) > 0;
    }

    private boolean isALeafNode(BinaryTreeNode<T> node) {
        return node.getLeft() == null && node.getRight() == null;
    }
}
