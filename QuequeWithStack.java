public class QuequeWithStack {
    Stack st = new Stack();
    Stack st1 = new Stack();

    public void enque(int item) {
        if (st.isEmpty()) {
            st.push(item);
        } else {
            while (!st.isEmpty()) {
                st1.push(st.pop());
            }
            st.push(item);
            while (!st1.isEmpty()) {
                st.push(item);
            }
        }
    }

    public int deque() {
        if (st.isEmpty()) {
            return -1;
        }
        return st.pop();
    }

    public int peek() {
        if (st.isEmpty()) {
            return -1;
        }
        return st.peek();
    }

    public static void main(String[] args) {
        QuequeWithStack que = new QuequeWithStack();
        que.enque(23);
        que.enque(230);
        que.enque(231);
        que.enque(232);
        System.out.println(que.deque());
    }
}
