import java.io.Serializable;
import java.util.List;

public class Candidate extends Person implements Serializable {

    private int totalPenalty;

    private List<String> try1;
    private List<String> try2;
    private List<String> try3;

    public Candidate(Integer id, String name, String country, Integer t, List<String> try1, List<String> try2, List<String> try3) {
        super(id, name, country, t);
        this.try1 = try1;
        this.try2 = try2;
        this.try3 = try3;
    }

    public int getTotalPenalty() {
        return totalPenalty;
    }

    public void setTotalPenalty(int totalPenalty) {
        this.totalPenalty = totalPenalty;
    }

    public void addToScoreboards() throws InterruptedException{
        Person t1 = new Person(try1);
        Thread r1 = new Thread(t1);
        r1.start();
        r1.join();
        //System.out.println(t1.getPenalty());

        Person t2 = new Person(try2);
        Thread r2 = new Thread(t2);
        r2.start();
        r2.join();
       // System.out.println(t2.getPenalty());

        Person t3 = new Person(try3);
        Thread r3 = new Thread(t3);
        r3.start();
        r3.join();
       // System.out.println(t3.getPenalty());

        totalPenalty = t1.getPenalty() + t2.getPenalty() + t3.getPenalty();

    }

    @Override
    public String toString() {
        return "id: "+getId() + ",nume: "+ getName()+ ", Country: "+getCountry() + ", Time: "+ getMin()+":"+getSec()+"+"+totalPenalty+","+try1+", "+try2+", "+try3;

    }
}
