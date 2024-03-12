package datastructures.tree;


import java.util.List;

public interface BinaryTree<T> {

    void insert(T data);

    void delete(T element);

    BinaryTreeNode<T> search(T element);

    List<BinaryTreeNode<T>> traverseInorder();

    boolean isBST();
}
