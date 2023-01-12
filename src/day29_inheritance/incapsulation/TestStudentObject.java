package day29_inheritance.incapsulation;

public class TestStudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Hamza",26,'M','D',"MIT");

        System.out.println(student1);

        student1.setSchoolName("Harward");

        System.out.println(student1);
        student1.setGrade('B');
        System.out.println(student1);

    }
}
