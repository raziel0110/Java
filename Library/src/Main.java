public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Books  book1 = new Books("Fat frumos",500);
        library.addBook(book1);


        Books book2 = new Novel("Dune",200,"SF");
        library.addBook(book2);


        Books book3 = new ArtAlbum("Colt alb", 250,"Recommended");
        library.addBook(book3);


        library.listBooks();

        library.deleteBook(book2);
        library.listBooks();
    }
}
