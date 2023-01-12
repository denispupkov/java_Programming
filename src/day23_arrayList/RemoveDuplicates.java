package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");

        for (int i = 0; i < names.size(); i++) {
            for (int j = i+1; j < names.size(); j++) {

                if (names.get(i).contains(names.get(j))) {
                    names.remove(i);
            }
        }
        }
        System.out.println(names);



    }
}
