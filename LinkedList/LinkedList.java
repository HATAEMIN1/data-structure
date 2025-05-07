package LinkedList;

public class LinkedList {
    Node header;

    static class Node {
        int data;
        Node next = null;
    }
    LinkedList() {
        header = new Node();
    }
    void append(int data){
        Node end = new Node();
        end.data = data;
        Node n = header;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
    void delete(int data){
        Node node = header;
        while(node.next != null){
            if(node.data == data){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
    }
    void retrieve(){
        Node node = header.next;
        while(node.next != null){
            System.out.print(node.data+ "->");
            node = node.next;
        }
        System.out.println(node.data);
    }

    void removeDups(){
        Node n = header;
        while(n!=null && n.next != null){
            Node r = n;
            while (r.next != null){
                if(n.data == r.next.data){
                    r.next = r.next.next;
                }else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.append(1);
//        list.append(2);
//        list.append(3);
//        list.append(4);
//        list.retrieve();
//        list.delete(1);
//        list.retrieve();
        list.append(2);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(4);
        list.append(2);
        list.retrieve();
        list.removeDups();
        list.retrieve();
    }
}
