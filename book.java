public class Book {
    private String bookName;
    private String isbnNumber;
    private String authorName;
    private String publisher;

    public Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookInfo() {
        return "Book Name: " + bookName + "\n" +
               "ISBN Number: " + isbnNumber + "\n" +
               "Author: " + authorName + "\n" +
               "Publisher: " + publisher;
    }

    public static void main(String[] args) {
        Book myBook = new Book("The Great Gatsby", "978-0743273565", "F. Scott Fitzgerald", "Scribner");

        System.out.println(myBook.getBookInfo());

        myBook.setAuthorName("Francis Scott Fitzgerald");
        myBook.setPublisher("Charles Scribner's Sons");

        System.out.println("\nUpdated Book Info:");
        System.out.println(myBook.getBookInfo());
    }
}
