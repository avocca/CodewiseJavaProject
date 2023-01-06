package hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Rad", 34);
        ages.put("Kim", 44);
        ages.put("Vlay", 23);
        ages.put("Kenny", 25);
        ages.put("Washington", 48);

        //print ages - print values
        //keySet() returns the set of keys
        for (String name : ages.keySet()) {
            System.out.println(ages.get(name));
        }

        //print names - print keys.
        for (String name : ages.keySet()) {
            System.out.println(name);
        }
        //==========================

        String userName1 = null;
        int age1 = 0;

        for (String name : ages.keySet()) {
            if (name.equals("Rad")) {
                userName1 = name;
                age1 = ages.get(name);
            }
        }
        System.out.println("Name: " + userName1 + ", Age: " + age1);

        //============================
        String userName2 = null;
        int age2 = 0;
        for (String name : ages.keySet()) {
            if (name.equals("Kim")) {
                userName2 = name;
                age2 = ages.get("Kim");

            }
        }
        System.out.println("Name: " + userName2 + ", Age: " + age2);

//========================================
        String[] names = new String[ages.keySet().size()]; //ages.size()
        int i = 0;

        for (String name : ages.keySet()) {
            names[i] = name;
            i++;
        }
        System.out.println(Arrays.toString(names));

        int[] age = new int[ages.keySet().size()];
        int j = 0;
        for (String name : ages.keySet()) {
            age[j] = ages.get(name);
            j++;
        }
        System.out.println(Arrays.toString(age));

        //keySet() returns collection of keys
        //entrySet() returns collection of keys and Values

        System.out.println("keySet(): " + ages.keySet());
        System.out.println("entrySet(): " + ages.entrySet());

        HashMap<String, String> fruitsAndVeggies = new HashMap<>();
        fruitsAndVeggies.put("apple", "fruit");
        fruitsAndVeggies.put("carrot", "veggi");
        fruitsAndVeggies.put("pear", "fruit");
        fruitsAndVeggies.put("cabbage", "veggi");

        for (String fruits : fruitsAndVeggies.keySet()) {
            if (fruitsAndVeggies.get(fruits).equals("fruit")) {
                System.out.println("Fruit: " + fruits);
            }
        }
            System.out.println();
           for(String veggies : fruitsAndVeggies.keySet()){
               if(fruitsAndVeggies.get(veggies).equals("veggi")){
                   System.out.println(fruitsAndVeggies.get(veggies) + ": " + veggies);
                   //or
                   System.out.println("Veggi: " + veggies);
               }
           }
            System.out.println("============");

           HashMap<String, String> words = new HashMap<>();
           words.put("window", "house");
           words.put("brick", "nature");
           words.put("water", "swimming");
           words.put("software", "system");
           words.put("music", "popular");

           for(String key : words.keySet()){
               if(words.get(key).length() <= 5){
                   System.out.println("length <= 5: " + words.get(key));
               }
           }
        System.out.println("-------");

        for(String key : words.keySet()){
            if(words.get(key).length() >= 7){
                System.out.println("length >= 7: " + words.get(key));
        }
        }
        System.out.println("--------");

        for(String key : words.keySet()){
            if(key.startsWith("a") || key.startsWith("b") || key.startsWith("c")){
                System.out.println("starts with letter a or b or c: " + key);
            }
        }

        for(String key : words.keySet()){
            if(key.endsWith("e") || key.endsWith("o")){
                System.out.println("ends with letter e or o: " + key);
            }
        }


        boolean isEmpty = words.isEmpty();
        System.out.println(isEmpty);  //false

        words.clear();
        System.out.println(words.isEmpty());  //true








        }
    }
