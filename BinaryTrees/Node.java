package BinaryTrees;

public class Node<T> {

    public int data;
    public Node<T> left = null;
    public Node<T> right = null;
    public Node<T> parent = null;

    private Node() {}

    public Node(int data) {
        this.data = data;
    }
}
