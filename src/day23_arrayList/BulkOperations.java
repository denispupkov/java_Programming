package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll( 1, numbers );

        System.out.println(list1);

        ArrayList <Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(1,2,3,4,5,6));

        System.out.println(scores);

        ArrayList <String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Malika","John","Mehmet","Sobur","Yan"));
        System.out.println(students);

        students.addAll(2,Arrays.asList("Shukur","Sumeye","Tatiana"));
        System.out.println(students);

        Integer [] nums = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.addAll(Arrays.asList(nums));
        System.out.println(l1);

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena","Muhtar","Godir","Ali"));
        boolean hasAlena = employeeList.contains("Alena");
        System.out.println(hasAlena);
        boolean hasAlenaGodir = employeeList.containsAll(Arrays.asList("Alena","Godir"));
        System.out.println(hasAlenaGodir);
        boolean hasMuhtarAliKuzzat = employeeList.containsAll(Arrays.asList("Muhtar","Ali","Kuzzat"));
        System.out.println(hasMuhtarAliKuzzat);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20));
        System.out.println(list);
        list.removeAll(Arrays.asList(10,20));
        System.out.println(list);

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Godir","Ali","Khashvar","Madivar","Muhtar","Muhtar"));
        developers.retainAll(Arrays.asList("Alena","Khashvar"));

        System.out.println(developers);







    }
}
