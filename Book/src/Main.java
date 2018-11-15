public class Main {
    public static void main(String[] args) {
        Repository reponov = new Repository();
        Books book3 = new Books("titluu",4);
         Books book = new Novel("Titlu",3,"tip");
         Books book2 = new Album("Titlu2",3,"tip");
         Books book4 = new Books("Salam",4);

        reponov.addBooks(book3);
        reponov.addBooks(book);
        reponov.addBooks(book2);
        reponov.listBooks();
        reponov.removeBooks(book2);
        reponov.listBooks();

        reponov.addBooks(book4);
        reponov.listBooks();
        reponov.removeBooks(book4);
        reponov.listBooks();

    }
}
