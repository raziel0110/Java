import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String StudentId;
    private String courses = null;
    private int tuitionBalance = 600;
    private static int costOdCourses;
    private static int id = 1000;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 -  Shomore\n3 - Junior\n4 - Senior\nEnter class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + "" + StudentId);

    }
    //Constructor : prompt user to enter students names and year

    // generate an ID

    private void setStudentID(){
        //Grade level + id
        id++;
        this.StudentId =  gradeYear + "" + id;
    }

    //Enroll in curses
    public void enrol(){
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOdCourses;
            } else {break;}
        } while(1 != 0);
        System.out.println("Enrolled in :"+ courses);
        System.out.println("Tuition balance : " + tuitionBalance);
    }

    //View balance

    //Pay course

    // Show Status
}
