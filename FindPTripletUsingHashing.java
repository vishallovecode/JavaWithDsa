import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class FindTheTripletWithGivenSum {

    public static  int [] printTriplet (int array  [] , int target) {
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        for(int i=0;i<array.length;i++) {
            map.put(array[i],i);
           }
           int result  [] = new int [3];
           for(int k =0;k<array.length;k++) {
            for(int p = k+1;p<array.length;p++) {
                int thirdValue =  target - (array[p]+array[k]);
                if(map.containsKey(thirdValue)) {
                    if(map.get(thirdValue) !=p && map.get(thirdValue)!=k) {
                     result[0] = thirdValue;
                     result[1] = array[p];
                     result[2] = array[k];
                     return result;
                }
            }
    }
}
return result;
}
    public static void main(String[] args) {
       
        int array  [] =  {-1,2,-4,5,8,-9,-12,16,18};
        int target  = 33;
       int result [] = printTriplet(array , target);
       System.out.println(Arrays.toString(result));
    }
}



// Two pointer approach ? 0(nlogn) => try it.


