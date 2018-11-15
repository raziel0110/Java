public class Books {
    private String title;
    private Integer nr_pages;

    // constructor
    public Books(String title, Integer nr_pages){
        this.title = title;
        this.nr_pages = nr_pages;
    }

    public String getTitle() {
        return title;
    }

    public Integer getNr_pages() {
        return nr_pages;
    }

    public String toString(){
        return "Title: "+title + "; Nr. of pages: " + nr_pages.toString()+";";
    }

}
