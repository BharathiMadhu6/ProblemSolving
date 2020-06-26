package Heap;

public class MaxHeap {

    public static final int FRONT = 1;
    public int size;
    public int maxSize;
    public int[] heap;

    public MaxHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MAX_VALUE;
    }

    private int parent(int p){
        return (p / 2);
    }

    private int left(int p){
        return (p * 2);
    }

    private int right(int p){
        return (p * 2) + 1;
    }

    private void swap(int p1, int p2){
        int temp = heap[p1];
        heap[p1] = heap[p2];
        heap[p2] = temp;
    }

    private boolean isLeaf(int p){
        if((p >= size / 2) && (p <= size)){
            return true;
        }
        return false;
    }

    public void maxHeapify(int p){
        if(!isLeaf(p)){
            if((heap[p] < heap[left(p)]) || (heap[p] < heap[right(p)])){
                if(heap[left(p)] > heap[right(p)]){
                    swap(p, left(p));
                    maxHeapify(left(p));
                }
                else {
                    swap(p, right(p));
                    maxHeapify(right(p));
                }
            }
        }
    }

    public void insert(int val){
        if(size >= maxSize){
            return;
        }
        heap[++size] = val;
        int cur = size;

        while(heap[cur] > heap[parent(cur)]){
            swap(cur, parent(cur));
            cur = parent(cur);
        }
    }

    public void print(){
        for(int i = 1; i <= size / 2; i++){
            System.out.println(" Parent : "+heap[i]+
                    " Left child : "+heap[i * 2]+
                    " Right child : "+heap[(i * 2) + 1]);
        }
    }

    public int remove(){
        int popped = heap[FRONT];
        heap[FRONT] = size--;
        maxHeapify(FRONT);
        return popped;
    }

    public static void main(String[] args){
        MaxHeap max = new MaxHeap(10);
        max.insert(5);
        max.insert(3);
        max.insert(17);
        max.insert(10);
        max.insert(84);
        max.insert(19);
        max.insert(6);
        max.insert(22);
        max.insert(9);
        System.out.println("Heap :");
        max.print();
        System.out.println("popped : "+max.remove());
        max.print();
    }
}
