package library2;

import java.util.Comparator;

public class book implements Comparable<book> {

    public int bookID;
    public String bookTitle;
    public String bookAuthor;
    public String bookYear;

    public book(int ID, String title, String author, String year) {
        bookID = ID;
        bookTitle = title;
        bookAuthor = author;
        bookYear = year;

    }
    public static Comparator<book> bookYearComparator = new Comparator<book>() {
        @Override
        public int compare(book b1, book b2) {

            String author1 = b1.bookYear.toUpperCase();
            String author2 = b2.bookYear.toUpperCase();

            return author1.compareTo(author2);

        }
    };

    public static Comparator<book> bookAuthorComparator = new Comparator<book>() {
        @Override
        public int compare(book b1, book b2) {

            String author1 = b1.bookAuthor.toUpperCase();
            String author2 = b2.bookAuthor.toUpperCase();

            return author1.compareTo(author2);

        }
    };

    public static Comparator<book> bookYearComparator = new Comparator<book>() {
        @Override
        public int compare(book b1, book b2) {

            String author1 = b1.bookYear.toUpperCase();
            String author2 = b2.bookYear.toUpperCase();

            return author1.compareTo(author2);

        }
    };

    @Override
    public int compareTo(book o) {
        String title = o.bookTitle;

        return this.bookTitle.compareTo(title);
    }
}



