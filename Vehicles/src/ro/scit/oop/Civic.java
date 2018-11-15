package ro.scit.oop;

public class Civic extends Honda {
    private double avaibleFuel;
    private String chassisNumber;


    public Civic(int avaibleFuel, String chassisNumber) {
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
        return "Civic{" +
                "avaibleFuel=" + avaibleFuel +
                ", chassisNumber='" + chassisNumber + '\''+ " Fuel Burned: " + getConsum()+ " Avaible fuel: " + getAvaibleFuel() +" " +
                '}';
    }
}
