package ro.scit.oop;

public class Duster extends Dacia {
    private double avaibleFuel;
    private String chassisNumber;


    public Duster(double avaibleFuel, String chassisNumber) {
        this.avaibleFuel = avaibleFuel;
        this.chassisNumber = chassisNumber;
    }

    public double getAvaibleFuel() {
        double fuelBurn = getConsum();
        avaibleFuel = avaibleFuel - fuelBurn;
        return  avaibleFuel;
    }

    @Override
    public String toString() {
        return "Duster{" +
                "avaibleFuel=" + avaibleFuel +
                ", chassisNumber='" + chassisNumber + '\'' + " Fuel Burned: " + getConsum() + " Avaible Fuel: " + getAvaibleFuel() +
                '}';
    }
}
