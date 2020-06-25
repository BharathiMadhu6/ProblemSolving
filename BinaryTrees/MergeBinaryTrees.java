package BinaryTrees;

public class MergeBinaryTrees {

    public Node merge(Node root1, Node root2){
        if(root2 == null){
            return root1;
        }

        if(root1 == null){
            return root2;
        }

        root1.data = root1.data += root2.data;
        root1.left = merge(root1.left, root2.left);
        root1.right = merge(root1.right, root2.right);
        return root1;
    }

    public static void main(String[] args){
        MergeBinaryTrees m = new MergeBinaryTrees();
        Node root = new Node<Integer>(1);
        root.left = new Node<Integer>(2);
        root.right = new Node<Integer>(3);
        root.left.left = new Node<Integer>(4);
        root.left.right = new Node<Integer>(5);
        root.left.right.left = new Node<Integer>(6);

        Node root2 = new Node<Integer>(2);
        root2.left = new Node<Integer>(2);

        Node res = m.merge(root, root2);
        System.out.println(res.data);
        System.out.println(res.left.data);
        System.out.println(res.right.data);
    }
}
