package day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level",
                "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String each = it.next();

            boolean isPalindrome = true;

            for (int i = 0; i < each.length()/2; i++) {
                if (each.toLowerCase().charAt(i) != each.toLowerCase().charAt(each.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
        }
            }
            if (isPalindrome) {
                it.remove();
            }
        }
        System.out.println(names);


        }

            }





