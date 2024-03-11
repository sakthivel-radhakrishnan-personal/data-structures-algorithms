package datastructures.tree;

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
    public void delete(T element) {

    }

    @Override
    public boolean search(T element) {
        return false;
    }

    private BinaryTreeNode<T> insertRecursive(BinaryTreeNode<T> root, BinaryTreeNode<T> newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }

        if (isNodeSmallerThanRoot(root, newNode)) {
            root.setLeft(insertRecursive(root.getLeft(), newNode));
        } else {
            root.setRight(insertRecursive(root.getRight(), newNode));
        }
        return root;
    }

    private boolean isNodeSmallerThanRoot(BinaryTreeNode<T> root, BinaryTreeNode<T> newNode) {
        return newNode.getData().compareTo(root.getData()) < 0;
    }
}
