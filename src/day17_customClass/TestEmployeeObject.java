package day17_customClass;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setInfo("Sumeye",28,'F',"Java Developer",95000,"A12");

        Employee employee2 = new Employee();

        employee2.setInfo("Khashavar",29,'M',"Back-end Developer",98000,"B13");

        System.out.println(employee1);
        System.out.println(employee2);

        employee2.work();


    }
}
