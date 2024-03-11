package datastructures.tree;

public interface BinaryTree<T> {

    void insert(T data);

    void delete(T element);

    boolean search(T element);

    void traverseInorder();
}
