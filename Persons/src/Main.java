public class Main {
    public static void main(String[] args) {
        Persoana p1 = new Persoana();
        Professor prof = new Professor();
        Student st = new Student(10);

        Persoana p2 = new Professor();
        Persoana p3 = new Student("vasile",13,Long.valueOf("1500"),Integer.valueOf("9"));

        p1.name = "Marian";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.salar);

    }
}
