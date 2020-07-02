package SingleLinkList;

import java.util.ArrayList;

public class Palindrome {

    Node head = null;

    public boolean isPalindrome(Node head){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node temp = head;
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }

        int start = 0;
        int end = list.size()-1;

        while(start < end){
            if(list.get(start).equals(list.get(end))){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Palindrome p = new Palindrome();
        p.head = new Node(-129);
        p.head.next = new Node(-129);
//        p.head.next.next = new Node(2);
//        p.head.next.next.next = new Node(2);
//        p.head.next.next.next.next = new Node(2);
//        p.head.next.next.next.next.next = new Node(1);
        System.out.print(p.isPalindrome(p.head));
    }
}
