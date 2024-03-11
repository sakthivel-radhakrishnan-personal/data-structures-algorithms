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
    public boolean search(T element) {
        return searchRecursive(root, element);
    }

    @Override
    public void delete(T element) {

    }

    @Override
    public void traverseInorder() {
        traverseInorderRecursive(root);
    }

    private void traverseInorderRecursive(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }
        traverseInorderRecursive(root.getLeft());
        System.out.print(root.getData() + " ");
        traverseInorderRecursive(root.getRight());
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

    private boolean searchRecursive(BinaryTreeNode<T> root, T element) {
        if (root == null) {
            return false;
        }

        if (root.getData().equals(element)) {
            return true;
        } else if (element.compareTo(root.getData()) < 0) {
            return searchRecursive(root.getLeft(), element);
        } else {
            return searchRecursive(root.getRight(), element);
        }
    }

    private boolean isNodeSmallerThanRoot(BinaryTreeNode<T> root, BinaryTreeNode<T> newNode) {
        return newNode.getData().compareTo(root.getData()) < 0;
    }
}
