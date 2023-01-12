package day28_encapsulation.encapsulation;

public class Student {

    private String name;
    private int age;

    public String getName() {

        if (name==null) {
            System.err.println("Name has not been initialized");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigits = false;
        boolean hasSpecialChars = false;

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigits = true;
                break;
            }
            if (!Character.isLetterOrDigit(each)) {
                hasSpecialChars = true;
            }
        }

            if (hasDigits || hasSpecialChars) {

                System.err.println("Invalid name");
                System.exit(1);
            }
            this.name = name;
        }



    public int getAge() {

        if (age==0) {
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 1 || newAge > 100) {
            System.err.println("Invalid Age "+age);
            //return;//using return statement still allows to print 0 which is not correct
            // that's why we shout use System.exit(); method
            System.exit(1);
        }

        this.age = newAge;
    }
}
