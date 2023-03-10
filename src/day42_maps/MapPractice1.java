package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {


        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        int males = 0;
        int females = 0;

        for (String gender :employeeMap.values()) {
            if (gender.equalsIgnoreCase("M")) {
            males++;
            }
            if (gender.equalsIgnoreCase("F")) {
                females++;
            }
        }

        System.out.println("females = " + females);
        System.out.println("males = " + males);


        for (Map.Entry <String, String >allNames : employeeMap.entrySet()) {
            if (allNames.getValue().equalsIgnoreCase("F")) {
                System.out.println(allNames.getKey());
            }
        }

        for (Map.Entry <String, String> each : employeeMap.entrySet()) {
            if (each.getValue().equalsIgnoreCase("M")) {
               each.setValue("Male");
            }
            if (each.getValue().equalsIgnoreCase("F")) {
                each.setValue("Female");
            }
            }
        System.out.println(employeeMap);


        }
    }

