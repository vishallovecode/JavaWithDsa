public class Stack {
    private int array[];
    private int top; // we are tracking the index of the last element
    private int size;

    Stack(int size) {
        array = new int[size];
        this.size = size;
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Overflow Error");
            System.exit(0);
        }
        top++;
        array[top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Overflow Error");
            System.exit(0);
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Overflow Error");
            System.exit(0);
        }
        return array[top];
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        // System.out.println(st.peek());
        // System.out.println(st.peek());
        // System.out.println(st.peek());
        // System.out.println(st.peek());
        // System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
