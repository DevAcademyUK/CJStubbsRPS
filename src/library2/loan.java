package library2;

import java.util.Comparator;

public class loan implements Comparable<loan> {

    public int bookID;
    public int memberID;


    public loan(int bID, int mID) {
        bookID = bID;
        memberID = mID;
    }


    public static Comparator<book> bookYearComparator = new Comparator<loan>() {
        @Override
        public int compare(book b1, book b2) {

            String author1 = b1.bookYear.toUpperCase();
            String author2 = b2.bookYear.toUpperCase();

            return author1.compareTo(author2);

        }
    };
}

