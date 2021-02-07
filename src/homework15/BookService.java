//слайд 38

package homework15;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        List<Album> booksSource = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        copyToBooks(booksSource, booksDestination);
    }


    public static void copyToBooks(List<? extends Book> src, List<Book> dest) {// исправление List<Book> src на List<? extends Book> src
        for (Book book : src) {
            dest.add(book);
        }
    }
}

