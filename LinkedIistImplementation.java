public class LinkedList {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Adding node into the first postion of linkde list
    // t.n 0(1)
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // Display all Node Value
    public void DisplayValue() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "=>");
            currNode = currNode.next;
        }
        System.out.println();

    }
        // t.n  0(n)
    public void addLast(int data) {
        Node node = new Node(data);
        // if the linked list is null
        if (head == null) {
            head = node;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = node;
    }
    // t.n 0(1)
    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;

    }

    // Remove Last Element form the linked list

  // t.c 0(n)
    public void removeLast() {
        // Home Work

        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        }
        Node prev = head;
        Node nextNode = head.next;
        while (nextNode.next != null) {
            prev = prev.next;
            nextNode = nextNode.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.addFirst(34);
        li.addFirst(45);
        li.addFirst(50);
        li.addFirst(100);
        li.addLast(60);
        li.DisplayValue();
        li.removeLast();
        li.DisplayValue();

    }
}

// Linked list last element
// Reverse Linked List
// 1-2-3-4 linked list
// tail

// DoublyLinked List

//
