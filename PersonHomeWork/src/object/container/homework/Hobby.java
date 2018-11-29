package object.container.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hobby {
    private String name;
    private int frequency;
    private List<String> adreesses = new ArrayList<>();

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAdreesses() {
        return adreesses;
    }

    public void setAdreesses(List<String> adreesses) {
        this.adreesses = adreesses;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", adreesses=" + adreesses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return frequency == hobby.frequency &&
                Objects.equals(name, hobby.name) &&
                Objects.equals(adreesses, hobby.adreesses);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, frequency, adreesses);
    }
}
