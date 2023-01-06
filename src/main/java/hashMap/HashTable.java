package hashMap;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> productPrices = new Hashtable<>();
        productPrices.put("apple", 3);
        productPrices.put("sugar", 5);
        productPrices.put("pepper", 1);
        productPrices.put("avocado", 2);
        productPrices.put("chicken", 6);
        productPrices.put("milk", 4);

        calculateTheSum(productPrices, 2);
        getProductsRange(productPrices, 2,3);

        getProductsRange2(productPrices, -199, 2); //given range is not between 0 and 100
        getProductsRange2(productPrices, 5, 100);

    }

    public static int calculateTheSum(Hashtable<String, Integer> products, int quantity) {
        int sum = 0;
        for (String key : products.keySet()) {
            sum += products.get(key) * quantity;
        }
        System.out.println("Products: " + products);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + sum);


        return sum;
    }

    public static Hashtable<String, Integer> getProductsRange(Hashtable<String, Integer> products, int beginRange, int endRange) {

        if (beginRange < endRange) {
            Hashtable<String, Integer> newRange = new Hashtable<>();
            for (String key : products.keySet()) {
                if (products.get(key) >= beginRange && products.get(key) <= endRange) {
                    newRange.put(key, products.get(key));
                }
            }
            System.out.println(newRange);
            return newRange;
        } else {
            System.out.println("Soryy, incorrect range was given. Give the true range.");
        }

        return null;
    }

    public static Hashtable<String, Integer> getProductsRange2(Hashtable<String, Integer> products, int beginRange, int endRange) {
        if(beginRange >= 0 && endRange <= 100) {
            if (beginRange < endRange) {
                Hashtable<String, Integer> newRange = new Hashtable<>();
                for (String key : products.keySet()) {
                    if (products.get(key) >= beginRange && products.get(key) <= endRange) {
                        newRange.put(key, products.get(key));
                    }
                }
                System.out.println(newRange);
                return newRange;
            } else {
                System.out.println("Soryy, incorrect range was given. Give the true range.");
            }

            return null;
        }else{
            System.out.println("Given range is not between 0 and 100");
        }
        return null;
    }

    public static Hashtable<String, Integer> getProductsRange3(Hashtable<String, Integer> products, int beginRange, int endRange) {
        if(beginRange >= 0 && endRange <= 100) {
            if(products.contains("a")){
            if (beginRange < endRange) {
                Hashtable<String, Integer> newRange = new Hashtable<>();
                for (String key : products.keySet()) {
                    if (products.get(key) >= beginRange && products.get(key) <= endRange) {
                        newRange.put(key, products.get(key));
                    }
                }
                System.out.println(newRange);
                return newRange;
            }
            } else {
                System.out.println("Soryy, incorrect range was given. Give the true range.");
            }

            return null;
        }else{
            System.out.println("Given range is not between 0 and 100");
        }
        return null;
    }








}







