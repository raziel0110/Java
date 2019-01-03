import java.util.List;
import java.util.Objects;

public class Person implements Runnable{
    private int id;
    private String name;
    private String country;
    private int t;
    private List<String> score;
    private int penalty = 0;
    private int min;
    private int sec;

    public Person(Integer id, String name, String country, Integer t) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.t = t;
    }

    public Person(List<String> score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getPenalty() {
        for(int i = 0; i < score.size(); i++){
            if(score.get(i) == "X"){
                this.penalty += 10;
            }
        }

        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getMin() {
        return this.t/60;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return this.t%60;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public String randomScore(){
        int random = (int)Math.floor(Math.random()* 99 + 1);
        if(random < 51){
            return "X";

        } else {
            return "O";
        }
    }



    public void run(){
        while(score.size() < 5){
            String randomShot = randomScore();
            score.add(randomShot);
        }
    }

//    @Override
//    public String toString() {
//        return String.valueOf(score);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                t == person.t &&
                penalty == person.penalty &&
                min == person.min &&
                sec == person.sec &&
                Objects.equals(name, person.name) &&
                Objects.equals(country, person.country) &&
                Objects.equals(score, person.score);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, country, t, score, penalty, min, sec);
    }

    @Override
    public String toString() {
        return "Person{" +
                "penalty=" + penalty +
                '}';
    }
}
