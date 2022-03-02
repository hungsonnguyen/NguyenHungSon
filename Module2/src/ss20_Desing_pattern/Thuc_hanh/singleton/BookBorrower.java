package ss20_Desing_pattern.Thuc_hanh.singleton;

public class BookBorrower {
    private Bookkingleton borrowBook;
    private boolean havaBook = false;
    public  void  borrowBook(){
        borrowBook = Bookkingleton.borrowBook();
        if (borrowBook == null){
            havaBook = false;
        }else {
            havaBook = true;
        }
    }
    public String getAuthorAndTitle(){
        if (havaBook){
            return borrowBook.getAuthorAndTitle();
        }
        else {
            return "I don't have the book";
        }
    }
    public void returnBook(){
        havaBook = false;
        borrowBook.returnBook(borrowBook);
    }
}
