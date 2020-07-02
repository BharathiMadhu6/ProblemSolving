package SingleLinkList;

public class LinkedList {

    public Node head;

    public LinkedList() {
        head = null;
    }

    public void insertHead(int data) {
        Node node = new Node(data);

        node.next = head;
        head = node;
    }

    public void insertTail(int data) {
        Node node = new Node(data);
        Node temp = head;

        if(head == null) {
            head = node;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void print() {
        if(head == null) {
            System.out.println("list empty");
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public int count() {
        if(head == null) {
            return 0;
        }

        int count = 1;
        Node temp = head;
        while(temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void reverse() {
        Node prev = null;
        Node cur = head;
        Node next = head.next;

        if(head == null || head.next == null) {
            return;
        }

        while(next != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        cur.next = prev;
        head = cur;
    }
}
