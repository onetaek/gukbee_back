package chapter20_tryCatch;

class Book{
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "bookNumber=" + bookNumber +
//                ", bookTitle='" + bookTitle + '\'' +
//                '}';
//    }
}

public class test08 {
    public static void main(String[] args) {
        Book book = new Book(200,"개미");
        System.out.println(book);
        System.out.println(book.toString());
    }
}
