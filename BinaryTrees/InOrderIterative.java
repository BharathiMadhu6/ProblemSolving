package BinaryTrees;

import java.util.Stack;

public class InOrderIterative {

    public void inOrder(Node root){
        Stack<Node> stack = new Stack<Node>();
        Node cur = root;
        while(cur != null || stack.size() > 0){

            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            if(!stack.isEmpty()){
                System.out.print(stack.peek().data+" ");
                cur = stack.pop().right;
            }
        }
    }

    public static void main(String[] args){
        InOrderIterative in = new InOrderIterative();
        Node<Integer> root = new Node<>(1);
        root.left = new Node<>(2);
        root.right = new Node<>(3);
        root.left.left = new Node<>(4);
        root.left.right = new Node<>(5);

        in.inOrder(root);
    }
}
