
public class Stack {
    // ArrayList<Integer> al = new ArrayList<>();
    // int array [];

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Push element into the stack
    public void push(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    //
    public int pop() {
        if (isEmpty()) {
            System.out.println("Overflow Error");
            return -1;
        }
        Node top = head;
        head = head.next;
        return top.data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Overflow Error");
            return -1;
        }
        // return head.data;
        Node top = head;
        return top.data;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        // System.out.println(st.peek());
        // System.out.println(st.peek());
        // System.out.println(st.peek());
        // System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
