import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> al = new ArrayList<>();
    public boolean isEmpty() {
        return al.size() == 0;
    }

    public void push(int item) {
        al.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("Overflow Error");
            System.exit(0);
        }
        int top = al.remove(al.size() - 1);
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.print("Overflow Error");
            System.exit(0);
        }
        return al.get(al.size() - 1);
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        // System.out.println(st.pop());

    }
}
