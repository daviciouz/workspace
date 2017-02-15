// You can use a boolean or else you can create a Gender enum:

In Gender.java:

public enum Gender {
    MALE,
    FEMALE
}

In Employee.java:

public class Employee {

    private String name;
    private int age;
    private Gender gender;

    public Employee(String name, int age, Gender gender) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        printGender();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) 
    {
        this.gender = gender;
    }
