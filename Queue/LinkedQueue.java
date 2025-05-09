package Queue;

import SingleLinkedList.LinkedList;

public class LinkedQueue<E> {
    private LinkedList<E> list;

    public LinkedQueue() {
        list = new LinkedList<>();
    }

    public void enqueue(E obj) {
        list.addLast(obj);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public E peek() {
        return list.peekFirst();
    }

    public boolean isEmpty() {
        return list.peekFirst() == null;
    }
    public int size(){
        return list.getSize();
    }
}
