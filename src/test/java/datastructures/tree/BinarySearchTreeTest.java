package datastructures.tree;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    @Test
    void testInsert() {
        BinaryTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
    }

    @Test
    void testInsertChar() {
        BinaryTree<Character> bst = new BinarySearchTree<>();
        bst.insert('q');
        bst.insert('a');
        bst.insert('z');
    }
}
