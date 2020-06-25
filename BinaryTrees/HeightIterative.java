package BinaryTrees;

import java.util.*;

public class HeightIterative {

    public int heightIterative(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;
        while(true){
            int count = queue.size();
            if(count == 0){
                return height;
            }
            else {
                height++;
            }

            while(count > 0){
                Node cur = queue.remove();
                if(cur.left != null){
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
                count--;
            }
        }
    }

    public int height(Node root){
        if(root == null){
            return 0;
        }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Integer.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args){
        HeightIterative h = new HeightIterative();
        Node root = new Node<Integer>(1);
        root.left = new Node<Integer>(2);
        root.right = new Node<Integer>(3);
        root.left.left = new Node<Integer>(4);
        root.left.right = new Node<Integer>(5);
        root.left.right.left = new Node<Integer>(6);

        System.out.print(h.height(root));
    }
}
