public class QuequeUsingLinkedList {
    Node front;
    Node rear;

    class Node {

        String name;
        Node next;

        Node(String name) {
            this.name = name;
            next = null;

        }
    }

    public void enque(String name) {
        Node node = new Node(name);
        if (rear == null) {
            front = rear = node;
        }

        rear.next = node;
        rear = node;

    }

    public String dequeque() {
        Node result = front;
        if (front == null) {
            return "";
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return result.name;
    }

    public static void main(String[] args) {
        QuequeUsingLinkedList que = new QuequeUsingLinkedList();
        que.enque("newton");
        que.enque("mse linus");
        que.enque("mse ether");
        System.out.println(que.dequeque());
        System.out.println(que.dequeque());
        System.out.println(que.dequeque());
        System.out.println(que.dequeque());

    }

}
