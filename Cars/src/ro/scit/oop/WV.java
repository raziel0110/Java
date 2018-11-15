package ro.scit.oop;

public class WV extends Cars {
    private boolean diesel;
    private int doors;

    public WV(int doors, float cc){
        super(cc);
        this.doors = doors;
        System.out.println("VW constructor"+toString());
    }

    public boolean isDiesel() {
        return diesel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    @Override
    public String toString() {
        return "WV{" +
                "diesel=" + diesel +
                ", doors=" + doors +
                '}';
    }
}
