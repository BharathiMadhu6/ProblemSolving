package SingleLinkList;

public class Reverse {

    Node head = null;
    public Node reverseList(Node head){
        Node cur = head;
        Node next = head.next;
        Node prev = null;
        while(next != null){
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        cur.next = prev;
        return cur;
    }

    public void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        Reverse r = new Reverse();
        r.head = new Node(1);
        r.head.next = new Node(2);
        r.head.next.next = new Node(3);
        r.head.next.next.next = new Node(4);
        r.head.next.next.next.next = new Node(5);
        Node revHead = r.reverseList(r.head);
        r.print(revHead);
    }
}
