package arrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        //contains(element) it will return boolean
        //true if contains, false if doesn't contain

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                evenNumbers.add(i);
            }
        }
        System.out.println(evenNumbers);

        ArrayList <Integer> num = new ArrayList<>();
        for(int j = 0; j <= 100; j++) {
            if (j % 3 == 0) {
                num.add(j);
            }
        }
            System.out.println(num);

        ArrayList<String> apples = new ArrayList<>();
        apples.add("1 apple");

        for(int k = 2; k <= 100; k++){
            if(k % 10 != 0){
                apples.add(k + " apples");
            }
        }
        System.out.println(apples);

        for(int j = 1000; j <= 1100; j++){
            if(j % 2 != 0){
                apples.add(j + " apples");
            }
        }
        for(int m = 0; m < apples.size(); m++){// print using for loop
            System.out.println(apples.get(m));
        }

        boolean b = apples.contains("2 apples");
        System.out.println(b); // true

        b = apples.contains("2 apple");
        System.out.println(b); //false

    }
}
