package day29_inheritance.incapsulation;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public void study () {
        System.out.println("The student "+name+" is studying in "+schoolName);
    }

    public String getName() {
        if (name == null) {
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Invalid student name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            System.err.println("The age cannot be negative");
            System.exit(1);
        }

        if (age<5 || age>90) {
            System.err.println("Invalid student age"+age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender=='M' || gender=='F') {
            this.gender = gender;
        }
        else {
            System.err.println("The gender is incorrect");
            System.exit(1);
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F') {
            this.grade = grade;
        }
        else {
            System.err.println("The grade is incorrect");
            System.exit(1);
        }

    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
