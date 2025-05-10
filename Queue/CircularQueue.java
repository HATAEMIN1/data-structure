package Queue;

public class CircularQueue {
    int[] queue;
    int front,rear,size;

    public CircularQueue(int capacity){
        queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) throw new RuntimeException("Queue is full");
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int dequeue() {
        if (size == 0) throw new RuntimeException("Queue is empty");
        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }
}
