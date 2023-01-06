package hashMap;

import java.util.HashMap;

public class HashMapIfAbsent {
    public static void main(String[] args) {
        //absent - off, out, missing, not there

        HashMap <String, String> catOwners = new HashMap<>();
        catOwners.put("Tom", "Mira");
        catOwners.put("Garfield", "Jack");
        catOwners.put("Akji", "Saikal");
        catOwners.put("Miu", "V");

        System.out.println("the size: " + catOwners.size());
        System.out.println("cat owners: " + catOwners);

        catOwners.putIfAbsent("Arti", "Jam");
        System.out.println("the size: " + catOwners.size());
        System.out.println("cat owners: " + catOwners);

        catOwners.putIfAbsent("Miu", "Ken");   //not going to add Miu to the list because it already there Miu
        System.out.println("the size: " + catOwners.size());
        System.out.println("cat owners: " + catOwners);

        catOwners.putIfAbsent("Jaaa", "Ken");  //will add because the value can be used multiple times
        System.out.println("the size: " + catOwners.size());
        System.out.println("cat owners: " + catOwners);


        int i = 1;
        for(String key : catOwners.keySet()){
            System.out.println("Cat #" + i + " " + key);
            i++;  //to update our numbers
        }
        System.out.println("---------");

        int j = 1;
        for(String key : catOwners.keySet()){
            System.out.println("Cat #" + j + " " + key + ", owner #" + j + ": " + catOwners.get(key));
            j++;  //to update our numbers
        }

        for(String catOwnerName : catOwners.values()){
            System.out.println("cat owner name: " + catOwnerName);
        }














    }
}
