import java.util.HashMap;

public class FindAPairWithGivenSum {
    public static void main(String[] args) {
        HashMap<Integer , Integer> map  = new HashMap<Integer , Integer>();
        int array  [] =  {-1,2,-4,5,8,-9,-12,16,18};
        int target  = 33;
        for(int i =0;i<array.length;i++) {
            if(map.containsKey(target - array[i])) {
                System.out.println(target-array[i] + ", " + array[i]);
            } else {
                map.put(array[i],i);
            }
        }
    }
}

