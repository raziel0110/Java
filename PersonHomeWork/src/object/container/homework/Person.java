package object.container.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  class Person  {
    private String name;
    private int age;
    private String adress;
    private List<Hobby> hobbies = new ArrayList<>();

    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(adress, person.adress) &&
                Objects.equals(hobbies, person.hobbies);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, adress, hobbies);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", age: " + getAge() + " Hobby : " + getHobbies();
    }


    public void setHobbies(Hobby hobby1) {
    }
}