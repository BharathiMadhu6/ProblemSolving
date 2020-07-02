package SingleLinkList;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertHead(1);
        list1.insertTail(2);
        list1.insertTail(3);
        list1.print();
        //System.out.println(list1.count());
        System.out.println("\n --- ");
        //list1.insertHead(0);
        //list1.print();
        //System.out.println(list1.count());
        list1.reverse();
        list1.print();
    }
}
