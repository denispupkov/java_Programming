package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

    String str = "aabcccdeeeef";
    String [] arr = str.split("");

    Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : arr) {
            int freq = Collections.frequency(Arrays.asList(arr),each);
            if (freq==1) {
                map.put(each,freq);
            }
        }
        System.out.println(map);



    }
}
