package BinaryTrees;

import java.util.LinkedList;
import java.util.List;

public class Diameter {

    public int diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH + rightH, Math.max(diameter(root.left), diameter(root.right)));
    }

    public int height(Node root){
        if(root == null){
            return 0;
        }

        int leftH = height(root.left);
        int rightH = height(root.right);
        return Math.max(leftH, rightH) + 1;
    }

    public static void main(String[] args){
        Diameter d = new Diameter();
        Node root = new Node<Integer>(1);
        root.left = new Node<Integer>(2);
        root.right = new Node<Integer>(3);
        root.left.left = new Node<Integer>(4);
        root.left.right = new Node<Integer>(5);
        root.left.left.left = new Node<Integer>(6);
        root.left.left.right = new Node<Integer>(7);
        root.left.left.right.left = new Node<Integer>(9);
        root.left.left.right.right = new Node<Integer>(10);
        root.left.right.right = new Node<Integer>(8);
        root.left.right.right.right = new Node<Integer>(11);
        System.out.println(d.diameter(root));

    }
}
