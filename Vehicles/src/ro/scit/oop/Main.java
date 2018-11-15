package ro.scit.oop;
public class Main{
    public static void main(String[] args){

        Cars car =  new Civic(27,"asdfghj");

       car.start();
       car.setGear(1);
       car.drive(10);
       car.setGear(2);
        car.drive(15);
        car.setGear(3);
        car.drive(20);
       car.stop();
        System.out.println(car.toString());
        System.out.println("--------------------------------------------------------------------------------------------");



        Cars accord = new Accord(47,"accordchassisNumber");
        accord.start();
        accord.setGear(1);
        accord.drive(1);
        accord.setGear(2);
        accord.drive(2);
        accord.setGear(3);
        accord.drive(1);
        accord.setGear(4);
        accord.drive(10);
        accord.setGear(5);
        accord.drive(150);
        accord.stop();
        System.out.println(accord.toString());
        System.out.println("--------------------------------------------------------------------------------------------");

        Cars logan = new Logan(48,"loganChassisNumber");
        logan.start();
        logan.setGear(1);
        logan.drive(0.01);
        logan.setGear(2);
        logan.drive(2);
        logan.setGear(3);
        logan.drive(1);
        logan.setGear(4);
        logan.drive(10);
        logan.setGear(5);
        logan.drive(150);
        logan.stop();
        System.out.println(accord.toString());
        System.out.println("--------------------------------------------------------------------------------------------");


        Cars duster = new Duster(32.6,"ds43tgf45");
        duster.start();
        duster.setGear(1);
        duster.drive(0.02);
        duster.setGear(2);
        duster.drive(0.2);
        duster.setGear(3);
        duster.drive(0.5);
        duster.setGear(4);
        duster.drive(2);
        duster.setGear(5);
        duster.drive(50);
        duster.setGear(6);
        duster.drive(200);
        duster.stop();
        System.out.println(duster.toString());
        System.out.println("--------------------------------------------------------------------------------------------");
    }

}
