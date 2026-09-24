public class HeapInsertion {

    private int[] heap;
    private int size;

    public HeapInsertion(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == heap.length) {
            throw new IllegalStateException("Heap is full");
        }

        heap[size] = value;
        int current = size;
        size++;

        while (current > 0) {
            int parent = (current - 1) / 2;

            if (heap[parent] >= heap[current]) {
                break;
            }

            swap(parent, current);
            current = parent;
        }
    }

    private void swap(int first, int second) {
        int temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        HeapInsertion heap = new HeapInsertion(10);

        heap.insert(20);
        heap.insert(40);
        heap.insert(10);
        heap.insert(50);
        heap.insert(30);

        System.out.print("Max Heap after insertion: ");
        heap.display();

        System.out.println("Heap size: " + heap.size());
    }
}
