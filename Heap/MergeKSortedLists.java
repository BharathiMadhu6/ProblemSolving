package Heap;

import java.util.PriorityQueue;

public class MergeKSortedLists {

    public ListNode merge(ListNode[] lists){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode t : lists){
            while(t != null){
                minHeap.add(t.data);
                t = t.next;
            }
        }

        ListNode temp = new ListNode(-1);
        while(!minHeap.isEmpty()){
            temp.next = new ListNode(minHeap.remove());
            temp = temp.next;
        }
        return temp.next;
    }
}
