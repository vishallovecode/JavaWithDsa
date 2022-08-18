import java.util.*;
import java.util.Map.Entry;

public class HashMaped {
    public static void main(String[] args) {
        HashMap<String, Integer> mymap = new HashMap<>();

        // Insertion or addition in hashmap
        mymap.put("CSE", 455055);
        mymap.put("ece", 2000);
        System.out.println(mymap); // {CSE=455055, ece=2000}

        // Accessing the value from the hashmap
        int data = mymap.get("CSE");
        System.out.println(data);

        // Find the particular key exist or not
        if (mymap.containsKey("CSE")) {
            System.out.println("Key Exist:: " + mymap.get("CSE"));
        } else {
            System.out.println("There is no key exist");
        }

        // Find the particular value exist or not
        if (mymap.containsValue(455055)) {
            System.out.println("Value Exist:: ");
        } else {
            System.out.println("There is no value exist");
        }

        // NEW KEY WILL BE NOT CREATED IF KEY ALREADY EXIST IT WILL REPLACE THE VALUE
        mymap.put("CSE", 12345);
        System.out.println(mymap);


        // delete the key
        mymap.remove("ece");
        System.out.println(mymap);

        // keySet

        mymap.put("mec", 12122);
        mymap.put("bio", 1232);;
        mymap.put("pharma", 122122);;
        mymap.put("civil", 1232);;
        System.out.println(mymap.keySet());

        // Iterate get(key)
        // for( String key: mymap.keySet()) {
        //     System.out.println(key+ "  "+ mymap.get(key));
        // }
         
        // iterate entry set
        // Entry<String , Integer> it : mymap.entrySet();
         for(Entry<String, Integer> it: mymap.entrySet()) {
            System.out.println(it);

         }
          

         // Iterate through value
         for(int value: mymap.values()) {
            System.out.println(value);
         }
         int array [] = {1,2,1,1,3,1,4,5,1,3,4} ;
         HashMap<Integer, Integer> map = new HashMap<>();

         for(int i= 0;i<array.length;i++) {
            if(map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i])+1);
            } else {
                map.put(array[i],1);
            }
         }
         int max =0;
         int maxData= 1;
       for(int i : map.keySet()) {
        int value  = map.get(i);
        if(value>max) {
            max= value;
            maxData= i;
        }
       }
       System.out.println(maxData);
       
    }
}

// HashMap does not support duplicate key.
// Hash map support duplicate value
// time complexity 
// faster 
// it store the key value pair

// [1,2,3,4,5,6,7,8,9,5,65,7,4,5,6]


