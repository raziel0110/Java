public class Album extends Books {
    private String quality;
    // getter
    public String getQuality(){ return  this.quality;}
    //construsctorul
    public Album(String title,Integer nr_pages,String quality ){
        super(title,nr_pages);
        this.quality = quality;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getPages().toString() + " " + getQuality() ;
    }
}
