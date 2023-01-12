package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {

        super(name, gender, dateOfBirth);
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);

        if (getAge()<18) {
            System.err.println("Invalid age "+getAge());
            System.exit(1);
        }
    }

    static {
        programmingLanguage = "Java";
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking "+programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" does not need to sleep");
    }



    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if (!(batchName.equalsIgnoreCase("Zero to Hero") ||
                batchName.equalsIgnoreCase("Alumni Dev"))) {
            System.err.println("Wrong batch name.");
            System.exit(1);
        }
        this.batchName = batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0) {
            System.err.println("Batch number cannot be zero or negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}

