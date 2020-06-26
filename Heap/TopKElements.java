package Heap;

import java.util.PriorityQueue;

public class TopKElements {

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int t : nums){
            minHeap.add(t);
        }

        int cur = 0;
        int uni = 0;
        int[] arr = new int[k];
        int i = 0;
        while(k != 0){
            cur = minHeap.remove();
            System.out.print(cur+" , ");
            if(cur != uni){
                uni = cur;
                arr[i++] = uni;
                k--;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3,0,1,0};
        TopKElements top = new TopKElements();
        top.topKFrequent(arr, 1);
    }
}
