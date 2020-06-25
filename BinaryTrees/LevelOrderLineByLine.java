package BinaryTrees;

import java.util.ArrayList;
import java.util.*;

public class LevelOrderLineByLine {

    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(true){
            int count = queue.size();
            if(count == 0){
                return list;
            }
            List<Integer> sub = new ArrayList<>();
            while(count > 0){
                Node cur = queue.remove();
                sub.add((Integer)cur.data);
                if(cur.left != null){
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
                count--;
            }
            list.add(sub);
        }
    }

    public static void main(String[] args){
        LevelOrderLineByLine l = new LevelOrderLineByLine();
        Node root = new Node<Integer>(1);
        root.left = new Node<Integer>(2);
        root.right = new Node<Integer>(3);
        root.left.left = new Node<Integer>(4);
        root.left.right = new Node<Integer>(5);
        root.left.right.right = new Node<Integer>(6);
        List<List<Integer>> list = l.levelOrder(root);
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
