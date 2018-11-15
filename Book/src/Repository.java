import java.util.ArrayList;

public class Repository {
    // asa se defineste arrayList
    ArrayList<Books> books;

    //constructor repository
    public Repository (){
        books = new ArrayList<Books>();
    }
    public void addBooks(Books book){
        books.add(book);
    }

    public void removeBooks(Books book){
        if(books.remove(book)){
            System.out.println("Remove ok!");
        } else{
            System.out.println("fail to remove");
        }

    }

    public void listBooks(){
        for (Books i: books
             ) {
            System.out.println(i.toString());

        }
    }

}



