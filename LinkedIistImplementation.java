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
    public void addFirst(int data) {
        Node node = new Node(data);
        // if(head == null) {
        // head = node;
        // }
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

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;

    }
public void removeLast () {
    // Home Work
}
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.addFirst(34);
        li.addFirst(45);
        li.addFirst(50);
        li.addFirst(100);
        li.addLast(60);
        li.DisplayValue();
        li.removeFirst();
        li.DisplayValue();

    }
}

// AddNode in first position of linked list
// AddNode in the last Position of linked list

//

