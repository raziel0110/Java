package object.container.homework;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Person pers1 = new Employee("Gabi",33,"Jupiter");
        Person pers2 = new Employee("Alban",40,"ceva adresa");
        Person pers3 = new Unemployee("John",25,"dont know");

        List<Hobby> hobbies1 = new ArrayList<>();
        Hobby hobby1 = new Hobby("Game pc",5);
        Hobby hobby2 = new Hobby("Cycling",2);
        Hobby hobby3 = new Hobby("Movies",7);
        Hobby hobby4 = new Hobby("Walking",100);
        Hobby hobby5 = new Hobby("Reading",5);
        Hobby hobby6 = new Hobby("Sleeping",7);


        hobbies1.add(hobby1);
        hobbies1.add(hobby2);
        hobbies1.add(hobby3);
        pers1.setHobbies(hobbies1);

        List<Hobby> hobbies2 = new ArrayList<>();


        hobbies2.add(hobby4);
        hobbies2.add(hobby5);
        hobbies2.add(hobby6);

        pers2.setHobbies(hobbies2);





        HashMap<Person,List<Hobby>> list = new HashMap<>();

        list.put(pers1,hobbies1 );
        list.put(pers2,hobbies2 );
//        list.put(pers3, );
//        list.put(pers3, );

        System.out.println("==================hobie=============================");
        for (Map.Entry<Person, List<Hobby>> entry : list.entrySet()) {
            System.out.println(entry);
        }

        sortByName();
        System.out.println("=============================================");
        sortByAge();

    }

    public static void sortByAge(){

        System.out.println("================Sort by age===================");
        TreeSet<Person> persons1 = new TreeSet<>(new SortByAge());
        persons1.add(new Employee("Gabi",33,"Jupiter 1/42"));
        persons1.add(new Employee("Alban",40,"ceva adresa"));
        persons1.add(new Unemployee("John",25,"dont know"));

        System.out.println(persons1);

    }

    public static void sortByName(){

        System.out.println("========================Sort By Name====================");
        Set<Person> persons = new TreeSet<>(new SortByName());

        persons.add(new Employee("Gabi",33,"Jupiter 1/42"));
        persons.add(new Employee("Alban",40,"ceva adresa"));
        persons.add(new Unemployee("John",25,"dont know"));



        for (Person e: persons){
            System.out.println(e.toString());
        }

    }

}
