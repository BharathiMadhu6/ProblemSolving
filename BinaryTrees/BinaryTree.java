package BinaryTrees;

import java.util.*;

public class BinaryTree<T> {

    public Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public void preOrder(Node<T> node){
        if(node != null) {
            System.out.print(node.data+",");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node<T> node) {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+",");
        }
    }

    public void inOrder(Node<T> node) {
        if(node != null) {
            inOrder(node.left);
            System.out.print(node.data+",");
            inOrder(node.right);
        }
    }

    public int height(Node<T> node) {
        if(node == null)
            return 0;
        int left = height(node.left);
        int right = height(node.right);

        return 1 + Math.max(left,right);
    }

    public int size(Node<T> node) {
        if(node == null)
            return 0;
        return size(node.left) + size(node.right)+1;
    }

    public void levelOrder(Node<T> root) {

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(queue.size() != 0) {
            Node<T> node = queue.remove();
            if(node != null) {
                System.out.print(node.data+" ");
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            else {
                System.out.println();
                if(queue.size() == 0)
                    break;
                queue.add(null);
            }
        }
    }

    // another version of level order
    public List<Integer> boundary(Assignment5.Node<Integer> node, List<Integer> list) {

        if (node.left != null)
            list.add(node.left.data);

        if (node.right != null)
            list.add(node.right.data);

        if(node.left == null || node.right == null)
            return null;

        boundary(node.left,list);
        boundary(node.right,list);

        return list;
    }

    public void zigZagOrder(Node<T> root) {

        Stack<Node<T>> stackA = new Stack<>();
        Stack<Node<T>> stackB = new Stack<>();

        Node<T> temp;
        boolean leftToRight = true;

        stackA.push(root);

        while (stackA.size() != 0) {
            temp = stackA.pop();

            if(temp != null && leftToRight) {
                System.out.print(temp.data+" ");
                if(temp.left != null)
                    stackB.push(temp.left);
                if(temp.right != null)
                    stackB.push(temp.right);
            }

            if(temp != null && !leftToRight) {
                System.out.print(temp.data+" ");
                if(temp.right != null)
                    stackB.push(temp.right);
                if(temp.left != null)
                    stackB.push(temp.left);
            }

            if(stackA.size() == 0) {
                System.out.println();
                stackA.addAll(stackB);
                stackB.clear();
                leftToRight = false;
            }
        }
    }
}

