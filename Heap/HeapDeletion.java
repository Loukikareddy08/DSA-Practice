public class HeapDeletion {

    private int[] heap;
    private int size;

    public HeapDeletion(int capacity) {
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

    public int deleteMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap[0];

        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);

        return max;
    }

    private void heapifyDown(int current) {
        while (true) {
            int left = 2 * current + 1;
            int right = 2 * current + 2;
            int largest = current;

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }

            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }

            if (largest == current) {
                break;
            }

            swap(current, largest);
            current = largest;
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

    public static void main(String[] args) {
        HeapDeletion heap = new HeapDeletion(10);

        heap.insert(50);
        heap.insert(30);
        heap.insert(40);
        heap.insert(10);
        heap.insert(20);

        System.out.print("Before deletion: ");
        heap.display();

        System.out.println("Deleted: " + heap.deleteMax());

        System.out.print("After deletion: ");
        heap.display();
    }
}
