import java.util.ArrayList;

public class Library {
    ArrayList<Books> book_array;

    public Library(){
        book_array = new ArrayList<Books>();
    }


    public void addBook(Books item){
        book_array.add(item);
    }

    public void deleteBook(Books item){
        book_array.remove(item);
    }

    public void listBooks(){
        for (Books i: book_array
             ) {
            System.out.println(i.toString());
        }
    }

}
