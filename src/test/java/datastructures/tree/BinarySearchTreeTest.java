package datastructures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void testSearch() {
        BinaryTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        assertTrue(bst.search(10));
        assertTrue(bst.search(5));
        assertTrue(bst.search(15));
        assertFalse(bst.search(20));
    }

    @Test
    void testSearchChar() {
        BinaryTree<Character> bst = new BinarySearchTree<>();
        bst.insert('q');
        bst.insert('a');
        bst.insert('z');
        assertTrue(bst.search('q'));
        assertTrue(bst.search('a'));
        assertTrue(bst.search('z'));
        assertFalse(bst.search('x'));
    }

    @Test
    void testTraverseInorder() {
        BinaryTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(17);
        bst.traverseInorder();
    }

    @Test
    void testTraverseInorderChar() {
        BinaryTree<Character> bst = new BinarySearchTree<>();
        bst.insert('q');
        bst.insert('a');
        bst.insert('z');
        bst.insert('x');
        bst.insert('c');
        bst.insert('m');
        bst.insert('r');
        bst.traverseInorder();
    }
}
