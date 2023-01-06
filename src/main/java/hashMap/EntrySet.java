package hashMap;

import java.util.HashMap;
import java.util.Map;

public class EntrySet {
    public static void main(String[] args) {

        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(10, "ten");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "four");

        //print only Keys
        for(Integer key : numbers.keySet()){
            System.out.println(key);
        }
        //==============================
        //print only Values
        for(Integer key : numbers.keySet()){
            System.out.println(numbers.get(key));
        }
        //==============================
        //ENTRY SET (key - value -> (entry))

        for(Integer key : numbers.keySet()){
            System.out.println(key + " - " + numbers.get(key));
        }
        //===========================
        for(Map.Entry<Integer, String> key : numbers.entrySet()){
            System.out.println(key);
        }

        System.out.println();
        System.out.println(numbers.entrySet());





    }
}
