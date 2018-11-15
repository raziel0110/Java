import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength =10;
    private String email;

    private String companySufix =  "company.com";



//    Constructor to receive the first name and the last name
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department - return the department

        this.department = setDepartment();
        System.out.println("Department "+this.department);

        // call a method that calls a random password

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is "+this.password);

        //combine element to generate email
        email = firstName.toLowerCase()+ "." + lastName.toLowerCase()+ "@" + department+"."+ companySufix;
        System.out.println("Your email: "+email);
        System.out.println("--------------------------------------------------");
    }
//     Ask for the department
    public String setDepartment(){
        System.out.println("Enter the deparment\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\nEnter the deparment:");
        Scanner in = new Scanner(System.in);
        int departmentChoise = in.nextInt();

        if(departmentChoise == 1){ return "sales";}
        else if(departmentChoise == 2){return "dev";}
        else if( departmentChoise == 3){return "Accounting";}
        else {return "";}
    }
//     Generate a random password
    private String randomPassword(int length){
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTUWXY0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length;i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }
//     Set the mailbox capacity

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public int getMailBoxCapacity(){
        return  mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return  alternateEmail;
    }


//    Set the alternative email
public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
}
//    Change the password
public void changePassword(String password){
     this.password = password;
}
 public String getPassword(){
        return password;
 }

 public String showInfo(){
     System.out.flush();
        return "Display name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nMailbox Capacity: " + mailBoxCapacity+"mb";
 }

}
