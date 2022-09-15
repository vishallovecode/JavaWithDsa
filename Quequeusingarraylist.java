import java.util.ArrayList;

public class QuequeWithArrayList {
    ArrayList<Integer> al = new ArrayList<>();
    // adding the element into the queque ??
    public void  enque (int data) {
        al.add(data);
    }

    public int dequeue () {
        // remove the element which is the firsr element inserted in the arraylist / queque

        // is Queque is empty or not 
        if(isEmpty()) {
            return -1;
        }
        int rear  = al.get(al.size()-1);
        al.remove(al.size()-1);
        return rear;
    }
    // is full condition not needed 
     public boolean isEmpty () {
        return al.size()==0;
     }

    public static void main(String[] args) {
        
    }
}
