public class Novel extends Books{
    private String type;

    public Novel(String title,Integer nr_pages, String type){
        super(title,nr_pages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString(){
        return "Title: "+ getTitle() + "; Nr of pages: " + getNr_pages().toString() + "; Type of novel: " + getType()+";";
    }
}
