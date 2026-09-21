package uml;

public class Book {
    private String isbn;
    private String title;
    private short publishYear;
    private boolean isBorrowed;

    public Book(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(short publishYear) {
        this.publishYear = publishYear;
    }

    public void borrowBook(){
        if(isBorrowed){
            System.out.println("Already borrowed");
            return;
        }
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }
}
