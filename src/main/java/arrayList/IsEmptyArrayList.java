package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsEmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> companies = new ArrayList<>();

        boolean isListEmpty = companies.isEmpty();
        System.out.println("Is companies list empty? " + isListEmpty);

        companies.add("Google");
        companies.add("Microsoft");
        companies.add("Cisco");
        companies.add("Uber");
        companies.add("Oracle");
        companies.add("Meta");

        isListEmpty = companies.isEmpty();
        System.out.println(isListEmpty); //false

        //convert ArrayList to Array
        String [] arrayOfCompanies = new String[companies.size()];
        companies.toArray(arrayOfCompanies);
        System.out.println(Arrays.toString(arrayOfCompanies));

        //convert Array to ArrayList
        String [] geeks = {"Saikal", "Myrzakhan", "Ilgiz", "Zhamal"};
        List<String> arrayListGeeks = Arrays.asList(geeks);
        System.out.println(arrayListGeeks);

        //convert ArrayListGeeks to Array
        String [] arrayOfGeeks = new String[arrayListGeeks.size()];
        arrayListGeeks.toArray(arrayOfGeeks);

        //another way to convert array to arraylist

        String [] testers = {"Ana", "Danel", "Aichurok", "Rack"};
        List <String> al = new ArrayList(Arrays.asList(testers));
        System.out.println(al);

        for(String tester: testers){
            System.out.println("for each: "+ tester);
        }

        int i = 0;
        while(i < al.size()){
            System.out.println("While loop: " + al.get(i));
            i++;
        }
        System.out.println();

        int g = 0;
        do{
            System.out.println("Do While loop: " + arrayOfGeeks[g]);
            g++;
        }while(g < arrayOfGeeks.length);

        System.out.println();

        for(int r = 0; r < arrayListGeeks.size(); r++){
            System.out.println("For Loop: " + arrayListGeeks.get(r));
        }












    }
}
