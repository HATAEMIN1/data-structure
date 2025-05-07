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
    private Node<E> tail;
    private int currentSize;

    public LinkedList(){
        head = null;
        tail = null;
        currentSize = 0;
    }

    @Override
    public void addFirst(E obj) {
        Node<E> node = new Node<E>(obj);
        node.next = head;
        head= node;
        if(tail == null){  //리스트가 비어있는 경우
            tail = node;
        }
        currentSize++;
    }

    @Override
    public void addLast(E obj) {
        Node<E> node = new Node<>(obj);
        if(head==null){
            head = node;
            tail = node;
            currentSize++;
            return;
        }
        tail.next = node;
        tail = node;
        currentSize++;
    }

    @Override
    public E removeFirst() {
        if(head==null){ //- 자료 구조가 비어있는 경우
            return null;
        }
        E tmp = head.data;
        if(head==tail){ //자료 구조에 단 하나의 요소가 들어 있을 때
            head = null;
            tail = null;
        }else {
            head = head.next;
        }
        return tmp;
    }

    @Override
    public E removeLast() {
        if(head==null){ //- 자료 구조가 비어있는 경우
            return null;
        }
        if(head==tail){ //자료 구조에 단 하나의 요소가 들어 있을 때
            removeFirst();
        }
        Node<E> current = head;
        Node<E> previous = null;
        while (current!=tail){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        tail = previous;
        currentSize--;
        return current.data;
    }

    @Override
    public E remove(E obj) {
        Node<E> current = head;
        Node<E> previous = null;
        while (current!=null){
            if(((Comparable<E>) obj).compareTo(current.data)==0){
                if(current==head){ //노드가 한개거나 첫 번째 노드를 제거할 때
                    return removeFirst();
                }
                if(current==tail){ //마지막 노드를 제거
                    removeLast();
                }
                currentSize--;
                previous.next = current.next;
                return current.data;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean contains(E obj) {
        Node<E> current = head;
        while (current!=null){
            if(((Comparable<E>) obj).compareTo(current.data)==0){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public E peekFirst() {
        if(head==null){
            return null;
        }
        return head.data;
    }

    @Override
    public E peekLast() {
        if(tail==null){
            return null;
        }
        return tail.data;
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
