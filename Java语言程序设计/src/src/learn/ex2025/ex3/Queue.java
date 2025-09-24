package learn.ex2025.ex3;

public class Queue {
    private int[] element; // 保存队列中的元素
    private int size; // 队列的当前大小
    private int capacity; // 队列的容量

    public Queue() {
        this.capacity = 8;
        this.element = new int[capacity];
        this.size = 0;
    }

    public void enqueue(int v) {
        if (size >= capacity) {
            int[] newElement = new int[capacity * 2];
            System.arraycopy(element, 0, newElement, 0, size);
            element = newElement;
            capacity *= 2;
        }
        element[size++] = v;
    }

    public int dequeue() {
        if (empty()) {
            System.out.println("队列为空，不能移除元素");
            return -1;
        }
        int removedElement = element[0];
        for (int i = 1; i < size; i++) {
            element[i - 1] = element[i];
        }
        size--;
        return removedElement;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        for(int i = 0;i<10;i++){
            queue.enqueue(i);
        }
        int len = queue.getSize();
        for (int i = 0;i<len;i++){
            System.out.print(queue.dequeue()+"  ");
        }
    }
}
