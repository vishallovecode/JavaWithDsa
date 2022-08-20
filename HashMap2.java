
import java.util.*;
import java.util.Map.Entry;


class MyClass {
int data  = 20;
MyClass() {
    System.out.println("Hey I am constructor");
}

}

public class HashMaped1 {
    public static void main(String[] args) {
      HashMap<String , Integer> map  =  new HashMap<String , Integer>(); 
      map.put("kanpur", 6000000);
      map.put("delhi", 300000000);
      map.put("bangalore", 300000012);
      map.put("mumbai", 500000000);
      map.put("punjab", 4000000);

      System.out.println(map); // {bangalore=300000012, mumbai=500000000, punjab=4000000, kanpur=6000000, delhi=300000000}
      // Hashmap is unordered collections


      // Get The value using the key 
      System.out.println(map.get("mumbai"));  // 500000000 

      // replace the value 
      map.put("mumbai",400000000 );

      // i want to know is key exist in the map
      if(!map.containsKey("lucknow")) {
        map.put("lucknow",  3500000);
      }
    System.out.println(map);
    if(!map.containsKey("delhi")) {
        map.put("delhi",  3500000);
      }

      //check whether value exist or not
      if(map.containsValue(3500000)) {
        System.out.println("Yes exist ");
      } else {
        System.out.println("Does not exist");
      }

      // check whether map is empty or not 
      if(map.isEmpty()) {
        System.out.println("Yes Map is Empty");
      } else {
        System.out.println("No Map is not Empty");
      }

      // Give me the all list of key of map 
      Set<String> s  = map.keySet();
      System.out.println(s);

    //  Entry<String,Integer> entry : map.entrySet(); 

      // How to get key using value ?

      // How to iterate the map 
    //  Entry<String,Integer> entry : map.entrySet(); 
    int value = 500000000 ;  // {bangalore=300000012, mumbai=500000000, punjab=4000000, kanpur=6000000, delhi=300000000}
      // entrySet  both entriesm key and value
    for(Entry<String , Integer> entry: map.entrySet()) {
        System.out.println(entry.getKey()+ "== " + entry.getValue());
        if(entry.getValue() == value) {
            System.out.println(entry.getKey());
        }
    }
          Set<String> keys  = map.keySet();
          for(String key: keys) {
            System.out.println(key);
          }


    }
}


// Packaage ??
// HashMap java.util.*;

// Key and Value 










