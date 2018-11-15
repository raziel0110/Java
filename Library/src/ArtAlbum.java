public class ArtAlbum extends Books {
    private String quality;

    public ArtAlbum(String title, Integer nr_pages, String quality){
        super(title,nr_pages);
        this.quality = quality;
    }

    public String getQuality(){
        return quality;
    }

    @Override
    public String toString() {
        return "Title: "+getTitle() + "; Nr of pages: " + getNr_pages().toString() +"; Quality: "+ getQuality();
    }
}
