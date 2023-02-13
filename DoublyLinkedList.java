public class doublyLinkedList {
    Node head ;
    class Node  {
        int data ; 
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            prev  = null;
            next = null;
        }
    }
    public void display() {
        Node ptr;
        ptr =head;
        while(ptr!=null) {
            System.out.println(ptr.data);
            ptr= ptr.next;
        }
    }
    public void insertFirst(int data) {
        // if there is already node exist 
        // else there is no node exist 

        // how should i know the linked list is empty ??

        Node newNode  = new Node(data);
        if(head==null) {
            head= newNode;
            // head.next =null;
            // head.prev  =null;
        } else {
                // here head is pointing to the firts node of the linked list we want to add
                // Node before that node, so our newnode next should point to the first node of current linked list before adding the newNode
                head.prev  =  newNode;
                newNode.next = head;
                head = newNode;
        } 
    }


    public void insertLast (int data) {
        Node newNode  = new Node(data);
        Node ptr ;
         ptr=head;
         if(head ==null) {
            head= newNode;
         }  else {
                     // traversing till the end of the loop 
            while(ptr.next!=null) {
                ptr = ptr.next;
            }
            // in this my ptr will be last node;
            ptr.next = newNode;
            newNode.prev = ptr;
         } 
    }
 
// public void insertAfterNode() {

// }
// public void insertBeforeNode() {

// }

// public void insertAtGivenIndex() {

// }


// delete the node after given node
// delete the node before given node
// delete the node in given index



public void deleteFromFirst() {
    if(head==null  ) {
        System.out.println("Overflow!!!!!");
        return;
    }  else {
        if(head.next !=null) {
            head.next.prev  =null;
        }
        if(head.next==null) {
            System.out.println("Deleting last|| first left node");
        }
        head = head.next;
    } 
}

public void deleteFromLast () {

  if(head.next==null) {
    head =null;
    return ;
  }
Node ptr   = head;
while(ptr.next!=null) {
    ptr= ptr.next;
}
ptr.prev.next =  null;
}

public static void main(String[] args) {
    doublyLinkedList dl  = new doublyLinkedList();
    dl.insertLast(600);
    dl.insertFirst(100); // node1
    dl.insertFirst(200); // node2
    dl.insertFirst(300); // node3
    dl.insertFirst(500);
    dl.insertLast(400);
    dl.deleteFromLast();
    dl.deleteFromLast();
    dl.deleteFromLast();
    dl.deleteFromLast();
    dl.deleteFromLast();
    dl.deleteFromLast();


          // last element delete

    // dl.deleteFromFirst();
 

    dl.display(); // 
}
}

// [500]->[300]->[200]->[100]->[600]-> [400]




//                     Node1                                   Node2                       Node3
// // head--->[prev->null , 200 , next --->Node1]-->[prev==node1, 100 , next=node3]-->[prev->node2 , 400, next=null]



// //ptr.next==null

// // ptr.prev.next = null








