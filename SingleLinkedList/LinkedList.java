package SingleLinkedList;

import java.util.Iterator;

public class LinkedList<E> implements ListI<E> {
    class Node<E>{
        E data;
        Node<E> next;
        public Node(E obj){
            data = obj;
            next = null;
        }
    }
    private Node<E> head;

    private int currentSize;

    public LinkedList(){
        head = null;
        currentSize = 0;
    }

    @Override
    public void addFirst(E obj) {
        Node<E> node = new Node<>(obj);
        node.next = head;
        head= node;
    }

    @Override
    public void addLast(E obj) {

    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E remove(E obj) {
        return null;
    }

    @Override
    public boolean contains(E obj) {
        return false;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }


/*
메소드를 만들 때 생각해야할 경계 조건
- 자료 구조가 비어있는 경우
- 자료 구조에 단 하나의 요소가 들어 있을 때
- 자료 구조의 첫 번째 요소를 제거하거나 추가 할때
- 자료 구조의 마지막 요소를 제거하거나 추가 할 때
- 자료 구조의 중간 부분을 처리할 때
  */

}
