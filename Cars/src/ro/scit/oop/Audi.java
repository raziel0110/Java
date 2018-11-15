package ro.scit.oop;

public class Audi extends WV {
    static{
        System.out.println("In static Audi");
    }

    private boolean quatro = false;
    public Audi(float cc){
        super(4,cc);
        quatro = true;
        System.out.println("Audi constructor"+ toString());

    }

    public boolean isQuatro() {
        return quatro;
    }

    @Override
    public String toString() {
        return "Audi{" +
                (quatro?"QUATRO":"")+
                '}';
    }
}
