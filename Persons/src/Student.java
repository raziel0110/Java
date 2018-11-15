public class Student extends Persoana {
    private  Integer nota;

    public Student(){

    }
    public Student(Integer nota){
        this.nota = nota;
    }



    public Student(String name, Integer age, Long salar, Integer nota){
        super();
        this.nota = nota;
        super.name = name;
        super.age = age;
        super.salar = salar;






    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }


}
