package BinaryTrees;

import java.util.LinkedList;
import java.util.List;

public class Flatten {
        public void flatten(Node<Integer> node) {

        List<Integer> list = new LinkedList<>();
        list = preOrder(node,list);
        Node<Integer> flatNode = flat(list,0);
        printFlattenedTree(flatNode);
    }

    public Node<Integer> flat(List<Integer> list, int i) {

        Node<Integer> node = new Node<>(list.get(i));
        i++;

        if(i >= list.size()) {
            return node;
        }

        node.right = flat(list,i);
        return node;
    }


    public List<Integer> preOrder(Node<Integer> node, List<Integer> list){
        if(node != null) {
            list.add(node.data);
            preOrder(node.left,list);
            preOrder(node.right,list);
        }
        return list;
    }

    public void printFlattenedTree(Node<Integer> node){

        while(node != null) {
            System.out.print(node.data+" ");
            node = node.right;
        }
        System.out.println();
    }
}
