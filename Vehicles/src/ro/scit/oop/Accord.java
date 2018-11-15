package ro.scit.oop;

public class Accord extends Honda {
    private double avaibleFuel;
    private String chassisNumber;

    public Accord(float avaibleFuel, String chassisNumber) {
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
        return "Accord{" +
                "avaibleFuel=" + avaibleFuel +
                ", chassisNumber='" + chassisNumber + '\'' + " Fuel Burned: " + getConsum() + " Avaible Fuel is: "+getAvaibleFuel() +
                '}';
    }
}
