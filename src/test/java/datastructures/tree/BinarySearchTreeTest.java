package datastructures.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    private final int TREE_SIZE = 1_00_000;

    @Test
    void testInsert() {
        BinaryTree<Integer> bst = new BinarySearchTree<>();
        // generate unique random numbers and insert them into the tree
        for (int i = 1; i <= TREE_SIZE; i++) {
            bst.insert((int) (Math.random() * TREE_SIZE));
        }
        assertTrue(bst.isBST());
    }

    @Test
    void testInsertChar() {
        BinaryTree<Character> bst = new BinarySearchTree<>();
        bst.insert('q');
        bst.insert('a');
        bst.insert('z');

        assertTrue(bst.isBST());
    }

    @Test
    void testSearch() {
        BinaryTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        assertTrue(bst.isBST());
        assertNotNull(bst.search(10));
        assertNotNull(bst.search(5));
        assertNotNull(bst.search(15));
        assertNull(bst.search(20));
    }

    @Test
    void testSearchChar() {
        BinaryTree<Character> bst = new BinarySearchTree<>();
        bst.insert('q');
        bst.insert('a');
        bst.insert('z');
        assertTrue(bst.isBST());
        assertNotNull(bst.search('q'));
        assertNotNull(bst.search('a'));
        assertNotNull(bst.search('z'));
        assertNull(bst.search('x'));
    }

    @Test
    void testTraverseInorder() {
        BinaryTree<Integer> bst = new BinarySearchTree<>();

        // generate unique random numbers and insert them into the tree
        for (int i = 1; i <= TREE_SIZE; i++) {
            bst.insert((int) (Math.random() * TREE_SIZE));
        }

        assertTrue(bst.isBST());

        List<BinaryTreeNode<Integer>> list = bst.traverseInorder();

        // check if the list is in the ascending order
        for (int i = 0; i < list.size() - 1; i++) {
            assertTrue(list.get(i).getData() < list.get(i + 1).getData());
        }
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

        assertTrue(bst.isBST());
        List<BinaryTreeNode<Character>> list = bst.traverseInorder();


        // check if the list is in the ascending order
        for (int i = 0; i < list.size() - 1; i++) {
            assertTrue(list.get(i).getData() < list.get(i + 1).getData());
        }
    }
}
