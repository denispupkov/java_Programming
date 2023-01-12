package day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);


        for ( Integer each1 : list) {
            int count = 0;
            for ( Integer each2 : list) {
                if (each1==each2) {
                    count++;
                }
            }
            if (count==1) {
                System.out.print(each1+" ");
                break;
            }
        }

    }
}



