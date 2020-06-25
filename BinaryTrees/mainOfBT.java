package BinaryTrees;

import java.util.Stack;

public class mainOfBT {

    public static void main(String[] args) {

        Node<Integer> root = new Node<Integer>(3);
        //1st level
        root.left = new Node<>(5);
        root.right = new Node<>(1);

        //2nd level
        root.left.left = new Node<>(6);
        root.left.right = new Node<>(2);
        root.right.left = new Node<>(0);
        root.right.right = new Node<>(8);

        //3rd level
//        root.left.left.left = new Node<>(8);
        root.left.right.left = new Node<>(7);
        root.right.right.right = new Node<>(4);

        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        System.out.println("preOrder ");
        binaryTree.preOrder(root);
        System.out.println("\n postOrder");
        binaryTree.postOrder(root);
        System.out.println("\nInline");
        binaryTree.inOrder(root);

//        int height = binaryTree.height(root);
//        System.out.println("height : "+height);
//
//        int size = binaryTree.size(root);
//        System.out.println("size : "+size);

        //binaryTree.levelOrder(root);
//        binaryTree.zigZagOrder(root);

    }

}
