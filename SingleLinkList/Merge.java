package SingleLinkList;

public class Merge {

    public Node merge(Node head1, Node head2){
        if(head1 == null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

        Node result;
        if(head1.data < head2.data){
            result = new Node(head1.data);
            result.next = merge(head1.next, head2);
        }
        else{
            result = new Node(head2.data);
            result.next = merge(head1, head2.next);
        }
        return result;
    }

    public void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args){
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        Merge m = new Merge();
        m.print(m.merge(head1, head2));
    }
}
