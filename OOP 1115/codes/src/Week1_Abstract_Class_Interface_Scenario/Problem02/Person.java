package Week1_Abstract_Class_Interface_Scenario.Problem02;

public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}
