package hashMap;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {

        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("cold", "hot");
        antonyms.put("long", "short");
        antonyms.put("hard", "soft");
        antonyms.put(null, "no data");
        antonyms.put("table", null);
        antonyms.put("screen", null);

        System.out.println(antonyms);
        System.out.println(antonyms.get("cold")); //gives us hot
        System.out.println(antonyms.get("hard")); //soft
        System.out.println(antonyms.get("longii")); //null because there is no longii
        System.out.println(antonyms.get(null)); //no data

        //HashMap is unordered collection. Elements do not have indexes/positions
        //inside the HashMap
        //If you provide nonexistent key in (get.) method HashMap returns null

        HashMap<String, Double> productPrice = new HashMap<>();
        productPrice.put("Bread", 6.5);
        productPrice.put("Tomatoes", 2.99);
        productPrice.put("Cookies", 2.5);
        productPrice.put("Milk", 5.99);
        productPrice.put("Tea", 8.79);

        System.out.println(productPrice);
        System.out.println(productPrice.get("Tea"));
        System.out.println(productPrice.get("Bread"));
        System.out.println(productPrice.size());

        HashMap<String, String> user = new HashMap<>();
        user.put("Alvaro", null);
        user.put("Jude", null);
        user.put(null, "Hakimi");
        user.put("Sergio", "Ramos");
        user.put("Van", "Dijk");

        HashMap<String, String> fullName = new HashMap<>(antonyms);
        //can copy another HashMap values by putting it in parentheses while HashMap declaration
        //value == entry

        HashMap<String, Byte> numbers = new HashMap<>();

        numbers.put("ONE", (byte) 1);
        numbers.put("TWO", (byte) 2);
        numbers.put("THREE", (byte) 3);
        numbers.put("FOUR", (byte) 4);
        numbers.put("FIVE", (byte) 5);
        System.out.println(numbers.get("FIVE"));

        HashMap<Integer, Integer> decimals = new HashMap<>();
        decimals.put(1, 100);
        decimals.put(2, 200);
        decimals.put(3, 300);
        decimals.put(4, 400);
        decimals.put(5, 500);
        System.out.println(decimals.get(3));
        System.out.println("decimals: " + decimals);
        System.out.println("decimals size: " + decimals.size());

        decimals.remove(2);
        System.out.println(decimals);


        boolean contains = decimals.containsKey(2); //true
        System.out.println(contains);

        System.out.println(decimals.containsKey(500)); //false
        System.out.println(decimals.containsValue(500 - 200)); //true

        System.out.println(decimals.containsKey(decimals.get(1) - 99));//true

        HashMap<String, HashMapIntro> myObj = new HashMap<>();
        myObj.put("first object ", new HashMapIntro());
        myObj.put("second object ", new HashMapIntro());


        HashMap<Double, Integer> nums = new HashMap<>();
        nums.put(1.99, 1);
        nums.put(2.99, 2);
        nums.put(3.99, 3);
        nums.put(4.99, 4);
        nums.put(5.99, 5);
        System.out.println("nums " + nums);

        HashMap <Integer, Integer> orders = new HashMap<>();
        orders.put(4, 5);
        orders.put(10, 5);
        orders.put(1343, 0);
        orders.put(574452, 366);
        orders.put(12, 2);
        orders.put(0, 6);
        System.out.println(orders);









    }
}
