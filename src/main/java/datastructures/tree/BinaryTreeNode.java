package datastructures.tree;

public class BinaryTreeNode<T> {

    private BinaryTreeNode<T> left;

    private BinaryTreeNode<T> right;

    private T data;

    BinaryTreeNode() {
        this.left = null;
        this.right = null;
    }

    BinaryTreeNode(T data) {
        this();
        this.data = data;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
