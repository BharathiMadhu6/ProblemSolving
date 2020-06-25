package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class FindValue {

    public boolean findNode(Node root, int val){
        if(root == null){
            return false;
        }

        if(root.data == val){
            return true;
        }

        return findNode(root.left, val) || findNode(root.right, val);
    }

    public static void main(String[] args){
        FindValue find = new FindValue();
        Node root = new Node<Integer>(1);
        root.left = new Node<Integer>(2);
        root.right = new Node<Integer>(3);
        root.left.left = new Node<Integer>(4);
        root.left.left = new Node<Integer>(5);
        root.right.right = new Node<Integer>(6);
        System.out.println(find.findNode(root,55));

        int val = 65 + 1;
        char c = (char)val;
        System.out.println(c+" cccc");
        String s = "";
        Queue<Integer> q = new LinkedList<>();

    }
}
