package Lesson4.Abstraction.BooksHW;

public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[3];
        book[0] = new Book("A", "Tom", 2015);
        book[1] = new Book("B", "Tim", 2000);
        book[2] = new Book("C", "Jim", 2005);
        System.out.println(findOldestBook(book).autor);
    }

    public static Book findOldestBook(Book[] books) {
        Book oldest = books[0];
        for (int i = 0; i > books.length; i++) {
            if (books[i].year < oldest.year) {
                oldest = books[i];
            }
        }
        return oldest;
    }
}
