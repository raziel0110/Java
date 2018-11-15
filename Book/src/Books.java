public class Books {

    private String title;
    private Integer nr_pages;


    // Constructor to receive the title and  author
    public Books(String title, Integer nr_pages){
        this.title = title;
        this.nr_pages = nr_pages;
    }
    //accesez din exterior la date din clasa
    public String getTitle(){return this.title;}
    public Integer getPages(){return this.nr_pages;}

    @Override
    public String toString() {
        return title + " " + nr_pages.toString();
    }
}
