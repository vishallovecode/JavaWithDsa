/*
// Information about the class Node
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
 
static Node swapkthnode(Node head, int num, int k)
{
     if(k>num) {
    return head;
     }
    Node KthstartNode =head;
    Node KthstartNode_prev = null;

    Node kthlastNode= head ;
    Node kthlastNode_prev = null;

    int count  = 1;
    while(count<k) {
        KthstartNode_prev = KthstartNode;
        KthstartNode = KthstartNode.next;
        count++;
    }

    // kthstartNode will point out to the kth node from starting
    // KthstartNode_prev will point to the kth previous node from starting

    int count1 = num-k;
    while(count1>0) {
        kthlastNode_prev =kthlastNode;
        kthlastNode = kthlastNode.next;
        count1--;
    }
// kthlastNode will point out to the kth node from ending
// kthlastNode_prev will point to the kth previous node from ending

if(KthstartNode_prev!=null) {
KthstartNode_prev.next =kthlastNode;
}
if(kthlastNode_prev!=null) {
    kthlastNode_prev.next = KthstartNode;
}
Node temp = KthstartNode.next;
KthstartNode.next = kthlastNode.next;
kthlastNode.next = temp;
if(k==1) {
    head = kthlastNode;
}
if(k==num)
 {
     head = KthstartNode;
 }
return head;
}


// Find kth node in given linked list from starting
//  Find the kth node in given linked list from the ending
// Find the middle noe  of linked list 

