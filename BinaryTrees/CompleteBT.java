package BinaryTrees;

public class CompleteBT {

    public boolean isComplete(Node root){

        if(root.left == null && root.right == null){
            return true;
        }

        if(root.left == null && root.right != null){
            return false;
        }

         if(root.left != null && root.right == null){
            return true;
        }

        return (isComplete(root.left) && isComplete(root.right));
    }

    public static void main(String[] args){
        CompleteBT c = new CompleteBT();
        Node root = new Node<Integer>(1);
        root.left = new Node<Integer>(2);
        root.right = new Node<Integer>(3);
//        root.left.left = new Node<Integer>(4);
//        root.left.right = new Node<Integer>(5);
//        root.right.right = new Node<Integer>(7);
        System.out.println(c.isComplete(root));
    }
}
