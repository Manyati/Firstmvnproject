package za.ac.cput;


/**
 * @Author Munyaradzi Manyati
 * @std 215211855
 * Munya.class
 * Maven Manyati 2021
 */

public class Munya {

    private String Name;
    private int Age;

    public Munya(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Munya{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
