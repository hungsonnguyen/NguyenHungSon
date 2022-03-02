package ss20_Desing_pattern.Thuc_hanh.singleton;

public class Bookkingleton {
    private String author;
    private String titile;
    private static Bookkingleton book;
    private static boolean isLoanedOut;
    private Bookkingleton(){
        author = "Gamma, Helm, John and Vvlissides";
        titile = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }
    public static Bookkingleton borrowBook(){
        if (!isLoanedOut){
            if (book==null){
                book = new Bookkingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }
    public void returnBook(Bookkingleton bookReturned){
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }


    public String getTitle() {
        return titile;
    }

    public static Bookkingleton getBook() {
        return book;
    }

    public static void setBook(Bookkingleton book) {
        Bookkingleton.book = book;
    }

    public String getAuthorAndTitle(){
        return getTitle() + " by "+ getAuthor();
    }

}
