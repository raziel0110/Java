package ro.scit.oop;

public class Logan extends Dacia {
    private double avaibleFuel;
    private String chassisNumber;


    public Logan(int avaibleFuel, String chassisNumber) {
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
        return "Logan{" +
                "avaibleFuel=" + avaibleFuel +
                ", chassisNumber='" + chassisNumber + '\'' + " Fuel Burned: " + getConsum() + " Avaible Fuel: " + getAvaibleFuel() +
                '}';
    }
}
