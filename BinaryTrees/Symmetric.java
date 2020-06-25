package BinaryTrees;
import java.util.*;

public class Symmetric {

    public boolean isSymmetric(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);

        while(!queue.isEmpty()){
            Node root1 = queue.poll();
            Node root2 = queue.poll();
            if(root1 == null && root2 == null){
                continue;
            }
            if(root1 == null || root2 == null){
                return false;
            }
            if(root1.data != root2.data){
                return false;
            }
            queue.add(root1.left);
            queue.add(root2.right);
            queue.add(root1.right);
            queue.add(root2.left);
        }
        return true;
    }

    public static void main(String[] args){
        Symmetric sym = new Symmetric();
        Node root = new Node<Integer>(1);
        root.left = new Node<Integer>(2);
        root.right = new Node<Integer>(2);
        root.left.left = new Node<Integer>(3);
        root.left.left = new Node<Integer>(4);
        root.right.right = new Node<Integer>(3);
        System.out.println(sym.isSymmetric(root));
    }
}
