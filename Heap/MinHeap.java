package Heap;

public class MinHeap {

    public static final int FRONT = 1;
    public int size;
    public int maxSize;
    public int[] heap;

    public MinHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[this.maxSize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int p){
        return (p/2);
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
        if((p >= size/2) && (p <= size)){
            return true;
        }
        return false;
    }

    public void minHeapify(int p){
        if(!isLeaf(p)){
            if((heap[p] > heap[left(p)]) || (heap[p] > heap[right(p)])){
                if(left(p) < right(p)){
                    swap(p, left(p));
                    minHeapify(left(p));
                }
                else {
                    swap(p, right(p));
                    minHeapify(right(p));
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

        while(heap[cur] < heap[parent(cur)]){
            swap(cur, parent(cur));
            cur = parent(cur);
        }
    }

    public void minHeap(){
        for(int p = (size/2); p >= 1; p--){
            minHeapify(p);
        }
    }

    public int remove(){
        int popped = heap[FRONT];
        heap[FRONT] = heap[size--];
        minHeapify(FRONT);
        return popped;
    }

    public void print(){
        for(int i = 1; i <= size / 2; i++){
            System.out.println(" Parent : "+heap[i]+
                        " Left child : "+heap[i * 2]+
                        " Right child : "+heap[(i * 2) + 1]);
        }
    }

    public static void main(String[] args){
        MinHeap min = new MinHeap(10);
        min.insert(5);
        min.insert(3);
        min.insert(17);
        min.insert(10);
        min.insert(84);
        min.insert(19);
        min.insert(6);
        min.insert(22);
        min.insert(9);
//        min.minHeap();
        System.out.println("heap : ");
        min.print();
        System.out.println("removed : "+min.remove());
        min.print();
    }
}
