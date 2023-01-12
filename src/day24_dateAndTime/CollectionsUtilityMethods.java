package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));
        System.out.println(names);
        Collections.replaceAll(names, "Java", "Selenium");
        System.out.println(names);

        System.out.println("___________________________________________");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,50,60,60,50,50,50));
        System.out.println(Collections.frequency(list,50));

        System.out.println("___________________________________________");
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int freq = Collections.frequency(words,"Java");
        System.out.println(freq);

        System.out.println("___________________________________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,50,60,60,50,50,50));

        for (int i = 0; i < numbers.size(); i++) {
            if (Collections.frequency(numbers,numbers.get(i))==1) {
                System.out.println(numbers.get(i));
            }
        }




    }
}
