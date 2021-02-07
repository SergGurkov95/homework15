//слайд 39

package homework15;

import java.util.ArrayList;
import java.util.List;

public class BookSevice2 {
    public static void main(String[] args) {

        List<Album> albumSource = new ArrayList<>();
        List<Album> albumDestination = new ArrayList<>();
        List<Book> booksSource = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();

        //Проверка кода на работоспособность

        Book book1 = new Book();
        Book book2 = new Book();

        Album album1 = new Album();
        Album album2 = new Album();

        booksSource.add(book1);
        booksSource.add(book1);
        booksSource.add(book2);

        albumSource.add(album1);
        albumSource.add(album2);

        copyToBooks(booksSource, booksDestination);
        copyToBooks(albumSource, booksDestination);
        copyToBooks(albumSource, albumDestination);

        System.out.println("У нас " + booksDestination.size() + " книг.\nИз них " + albumDestination.size() + " - альбомы." );
    }


    public static <T> void copyToBooks(List<? extends T> src, List<T> dest) {

        for (T book : src) {
            dest.add(book);
        }
    }


}


