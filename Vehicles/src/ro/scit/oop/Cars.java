package ro.scit.oop;

public abstract class Cars implements Vehicles{

    private int fuelTankSize = 50;
    private int gear;
    private String fuelType = "petrol";
    private float consumPer100Km =  4.8f;
    private double consum;

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if(this.gear + 1 == gear){
            this.gear = gear;
        } else {
            System.out.println("Can not shift gear!");
        }
    }

    public String getFuelType() {
        return fuelType;
    }


    public float getConsumPer100Km() {
        return consumPer100Km;
    }


    public double getConsum() {
        return consum;
    }

    public void setConsum(double consum) {
        this.consum = (this.consum + consum);
    }

    @Override
    public void start() {
        consum = 0;
    }

    @Override
    public void drive(double km) {
        if(gear == 1){
          double  consum2 = (consumPer100Km * km / 100) + 0.5d*(consumPer100Km * km / 100);
            setConsum(consum2);
        } else if(gear == 2){
            double  consum2 = (consumPer100Km * km / 100) + 0.4d*(consumPer100Km * km / 100);
            setConsum(consum2);
        } else if(gear == 3){
            double  consum2 = (consumPer100Km * km / 100) + 0.35f*(consumPer100Km * km / 100);
            setConsum(consum2);
        }else if(gear == 4){
            double  consum2 = (consumPer100Km * km / 100) + 0.2*(consumPer100Km * km / 100);
            setConsum(consum2);
        }else if(gear == 5){
            double  consum2 = (consumPer100Km * km / 100) + 0.1*(consumPer100Km * km / 100);
            setConsum(consum2);
        } else if(gear == 6){
            double  consum2 = (consumPer100Km * km / 100);
            setConsum(consum2);
        }
    }



    @Override
    public void stop() {
        System.out.println("Consumul este: " + consum );
    }
}
