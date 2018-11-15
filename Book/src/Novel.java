import java.util.ArrayList;

public class Novel extends Books {

    private String type;
    public String getType(){ return  this.type;}
    // constructor
    public Novel(String title,Integer nr_pages,String type ){
        super(title,nr_pages);//apeleaza constructorul de baza din clasa Books
        this.type = type;
    }

    @Override
    public String toString() {

        return getTitle() + " " + getPages().toString() + " " + getType();

    }
}
