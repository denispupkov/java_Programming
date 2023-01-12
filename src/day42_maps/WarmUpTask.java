package day42_maps;

import java.util.*;

public class WarmUpTask {

    public static void main(String[] args) {

         String str = "bbcccaaaaa";

         Map<Character, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            map.put(str.charAt(i),count);
        }

        System.out.println(map);

        System.out.println("______________________");

        Map<String, Integer> map2 = new LinkedHashMap<>();
        String str2 = "bbcccaaaaa";
        String [] arr;
        arr = str2.split("");
        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            map2.put(each,frequency);
        }

        System.out.println(map2);














    }
}
