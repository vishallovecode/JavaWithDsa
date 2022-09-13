public class Queque {
    int array[];
    int front;
    int rear;
    int capacity;

    Queque(int size) {
        array = new int[size];
        front = 0;
        rear = 0;
        capacity = size;
    }

    public void Enqueue(int value) {
        if (rear == capacity) {
            System.out.println("overflow error");
            return;
        }
        array[rear++] = value;
        return;
    }

    public int Deqqueue() {
        if (front == rear) {
            System.out.println("queque is epmty");
        }
        return array[front++];

    }

    // Print the top element in stack
    public int peek() {
        return array[front];
    }

    public static void main(String[] args) {
        Queque qe = new Queque(6);
        qe.Enqueue(23);
        System.out.println(qe.peek());
        System.out.println(qe.Deqqueue());
        System.out.println(qe.Deqqueue());
    }
}


