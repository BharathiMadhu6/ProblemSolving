package BinaryTrees;

import java.util.Stack;

public class PreOrderIterative {

    public void preOrder(Node root){
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        stack.push(cur);

        while(!stack.isEmpty()){
            cur = stack.pop();
            System.out.print(cur.data+" ");

            if(cur.right != null){
                stack.push(cur.right);
            }

            if(cur.left != null){
                stack.push(cur.left);
            }
        }
    }

    public static void main(String[] args) {
        PreOrderIterative pre = new PreOrderIterative();
        Node<Character> root = new Node<>('A');
//        root.left = new Node<>('B');
        root.right = new Node<>('C');
//        root.left.left = new Node<>('D');
//        root.left.right = new Node<>('E');
        root.right.left = new Node<>('F');
        root.right.right = new Node<>('G');
        pre.preOrder(root);
    }
}
