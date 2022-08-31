public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.head = new Node(20);

        Node data2 = new Node(20);
        Node data3 = new Node(3);
        Node data4 = new Node(4);

        li.head.next = data2;
        data2.next = data3;
        data3.next = data4;

        while (li.head != null) {
            System.out.println(li.head.data);
            li.head = li.head.next;
        }

    }
}
