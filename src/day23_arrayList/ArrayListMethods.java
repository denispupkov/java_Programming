package day23_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList <String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towel");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");
        System.out.println(groceriesList);
        groceriesList.set(2,"Oranges");
        System.out.println(groceriesList);
        groceriesList.remove(0);
        System.out.println(groceriesList);
        groceriesList.remove("Paper Towel");
        System.out.println(groceriesList);


    }
}
