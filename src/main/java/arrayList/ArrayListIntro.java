package arrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();  //  -   ArrayList

        //add() used to add values-elements inside ArrayList
        String[] arr = new String[]{}; //  -   Array
        groceryList.add("milk");
        groceryList.add("bread");
        groceryList.add("apples");
        System.out.println(groceryList);

        //get (int index) will return the element from given index
        System.out.println(groceryList.get(1));  //get the index of bread

        groceryList.add("ice cream");
        groceryList.add("peanut butter");
        groceryList.add("12");
        System.out.println(groceryList);
//generic Array List (with diamond sign)
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Practice Java");
        toDoList.add("Finish Codewise and find a job");
        toDoList.add("Work hard");
        toDoList.add("Travel");
        toDoList.add("Make mom happy");
        toDoList.add("Be healthy");
        System.out.println(toDoList);

        //non generic Array List to stole different data type
        ArrayList different = new ArrayList();
        different.add("Apple");
        different.add(12);
        different.add(true);
        System.out.println(different);

        int size = toDoList.size(); //size() is for ArrayList, length() for Array
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(toDoList.get(i) + " - DONE");
        }

        ArrayList <String> cars = new ArrayList<>();
        cars.add("Moserati");
        cars.add("Lamborgini");
        cars.add("Porche");
        cars.add("Mazda");
        cars.add("Bugatti");
        System.out.println(cars);

        cars.set(3, "Ferrari"); // changed Mazda to Ferrari
        System.out.println(cars);

        cars.set(0, "Mercedes");//Moserati to Mercedes
        System.out.println(cars);

        System.out.println("size: " + cars.size());
        System.out.println(cars.get(1)); //Lamborgini

        cars.remove(0); //will remove first element
        System.out.println(cars);

        System.out.println(cars.get(0)); //Lamborgini

        cars.remove(2);
        System.out.println(cars);

        System.out.println(cars.size());
        System.out.println(cars);


        cars.add(0,"Moserati");
        cars.add(3,"Ferrari");
        System.out.println(cars);

        System.out.println(cars.size());//5

        for(int i = 0; i < cars.size(); i++){ //use for loop to get specific element
            if(cars.get(i).equals("Ferrari")){
                System.out.println(cars.get(i));
            }
        }

        cars.clear(); //will remove all elements from ArrayList
        System.out.println(cars.size());//0

        //what if this is the end of the world
        //and if this is not woring make sure that you got this question rigth and be ready 





    }
}