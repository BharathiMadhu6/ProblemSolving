package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.lang.Integer.*;

public class KthSmallest {

    public int kthSmallest(int[][] matrix, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                pq.offer(matrix[i][j]);
            }
        }
        int d = k;
        int val = 0;
        while(d > 0){
             val = pq.remove();
            d--;
        }
        return val;
    }

    public static void main(String[] args){
        int[][] mat = {{1,5,9}, {10, 11, 13}, {12, 13, 15}};
        KthSmallest k = new KthSmallest();
        System.out.println("val : "+k.kthSmallest(mat,9));
    }
}
