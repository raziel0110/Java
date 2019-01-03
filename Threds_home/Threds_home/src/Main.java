import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main{

    //LISTA CANDIDATI
    List<Candidate> candidates = new ArrayList<>();

    public void citire() throws IOException,ClassNotFoundException {
        FileInputStream  fis = null;
        try{
            fis = new FileInputStream("Candidatess.csv");
            ObjectInputStream in = new ObjectInputStream(fis);

            candidates = (List<Candidate>) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Fisier no");
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           while(fis != null) {
               fis.close();
           }
        }

        System.out.println("Lista cadidatilor:\n" + candidates);
    }


    public void salvare() throws IOException{
        FileOutputStream fos = new FileOutputStream("Candidatess.csv");
        ObjectOutputStream out = new ObjectOutputStream(fos);

        out.writeObject(candidates);
    }

     public void adaugare() throws IOException, InterruptedException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("\nIndroduceti numarul candidatului: ");
            int id = Integer.parseInt(stdin.readLine());

            System.out.println("\nIntroduceti numele candidatului: ");
            String name = stdin.readLine();

            System.out.println("\nIntroduceti initialele tari: ");
            String country = stdin.readLine();

            System.out.println("\nIntroduceti timpul candidatului: ");
            int time = Integer.parseInt(stdin.readLine());

            Candidate candidate = new Candidate(id,name,country,time,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
            candidate.addToScoreboards();

            System.out.println(candidate);

            candidates.add(candidate);

            System.out.println("Mai adaugati candidat? (Y/N)");
            String question = stdin.readLine().toUpperCase();
            if(question.startsWith("N"))
                break;
        }


     }





    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {

        Main app = new Main();

        app.citire();

        app.adaugare();

        app.salvare();


    }


}
