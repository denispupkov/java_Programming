package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        list.add(1,15);
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohamed");
        studentsList.add("Abdul");
        studentsList.add("Tatiana");
        studentsList.add("Abdurasul");

        System.out.println(studentsList.size());
        System.out.println(studentsList);
        String thirdStudent = studentsList.get(2);
        String lastStudent = studentsList.get(studentsList.size()-1);
        System.out.println(thirdStudent);
        System.out.println(lastStudent);


    }
}
