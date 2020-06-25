package BinaryTrees;

import java.util.*;

public class LevelOrder {

    public void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.print(cur.data+" ");
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right != null) {
                queue.add(cur.right);
            }
        }
    }

    public static void main(String[] args){
        LevelOrder level = new LevelOrder();
        Node root = new Node<Integer>(1);
        root.left = new Node<Integer>(2);
        root.right = new Node<Integer>(3);
        root.left.left = new Node<Integer>(4);
        root.left.right = new Node<Integer>(5);
        level.levelOrder(root);
    }
}
