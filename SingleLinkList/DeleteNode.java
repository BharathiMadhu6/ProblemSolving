package SingleLinkList;

public class DeleteNode {

    Node head = null;

    public void delete(Node node){
        if(node.data == head.data){
            Node temp = head.next;
            head = null;
            head = temp;
        }
        else {
            Node prev = head;
            Node cur = head.next;
            while(cur.next != null){
                if(cur.data == node.data){
                    prev.next = cur.next;
                    break;
                }
                prev = cur;
                cur = cur.next;
            }
        }
        print(head);
    }

    public void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        DeleteNode n = new DeleteNode();
        n.head = new Node(1);
        n.head.next = new Node(1);
        n.head.next.next = new Node(1);
        n.head.next.next.next = new Node(1);
        n.delete( n.head.next.next);
    }
}
