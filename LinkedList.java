
public class LinkedList {
    static Node head;
    static Node tail;
    private int size = 0;

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
        if(head==null)  tail = node;
        node.next = head;
        head = node;
        size++;
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

    // t.n 0(n)
       // t.c should be 0(1)
   public void InsertLast () {

   }
    // public void addLast(int data) {
    //     Node node = new Node(data);
    //     // if the linked list is null
    //     if (head == null) {
    //         head = node;
    //     }
    //     Node currNode = head;
    //     while (currNode.next != null) {
    //         currNode = currNode.next;
    //     }
    //     currNode.next = node;
    //     size++;
    // }

    // t.n 0(1)
    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;

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
        size--;
    }

    public int getSize() {
        return size;
    }

    public static Node getMiddleElement() {
        Node prev;
        Node fast;
        prev = head;
        fast = head;
        while (fast != null && fast.next != null) {
            prev = prev.next;
            fast = fast.next.next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.addFirst(34);
        li.addFirst(45);
        li.addFirst(50);
        li.addFirst(100);
        li.addLast(67);
        li.addLast(64);
        li.addLast(34);
        li.addLast(62);
        li.DisplayValue();
        li.removeLast();
        li.DisplayValue();
        // System.out.print(li.getSize());
        Node middleElement = getMiddleElement();
        System.out.print(middleElement.data);

    }
}

// Linked list last element
// Reverse Linked List
// 1-2-3-4 linked list
// tail

// DoublyLinked List

//

// Getting the size of linked List
// Insert element after given node
// Reverse a linked list
// Insert in the last 0(1) tail pointer
//



// Add Element in last of linked list  0(1)
// Remove element form last in linked list 0(1)
// Reverse A linked list



// Doubly Linked list

// Circular list 


// Detect a loop in linked list 
//
