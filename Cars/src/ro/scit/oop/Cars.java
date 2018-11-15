package ro.scit.oop;

public class Cars {
    static {
        System.out.println("In static car");
    }

    private String color = "NO_COLOR";

    private float cc;

    private double pret;

//    public Cars(){
//
//    }

    public Cars(float cc) {
        this(cc, "INVISIBLE"); // se apeleaza celalalt constructor

    }
    public Cars(float cc,String color){
        this.cc = cc;
        this.color = color;
        System.out.println("Car constructor"+toString());
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getColor() {
        return color;
    }

    public float getCc() {
        return cc;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "color='" + color + '\'' +
                ", cc=" + cc +
                ", pret=" + pret +
                '}';
    }
}
