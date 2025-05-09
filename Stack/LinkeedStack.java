package Stack;

import SingleLinkedList.LinkedList;

public class LinkeedStack<E> {
    private LinkedList<E> list;

    public LinkeedStack(LinkedList<E> list) {
        list = new LinkedList<>();
    }

    public void push(E obj) {
        list.addFirst(obj);
    }

    public E pop() {
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
