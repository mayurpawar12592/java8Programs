import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Programs {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 8, 17, 15, 23, 6);
        long count = list.stream().count();
        System.out.println("Count of list no are:-" + count);

        //find ot max no from list
        int max = list.stream().max(Integer::compareTo).get();
        int max1 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max No is :" + max);
        System.out.println("Max No using is Comparator:" + max1);


        // find min no from list
        int min = list.stream().min(Integer::compareTo).get();
        System.out.println("Min No is " + min);
        int min1 = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min No using is Comparator:" + min1);

        //filter Example
        System.out.println("Filter Even no from the list :");
        list.stream().filter(no -> no % 2 == 0).forEach(System.out::println);

        //Map Example
        System.out.println("from list add 2 in each element: ");
        list.stream().map(no -> no + 2).forEach(System.out::println);

        //generate Infinte stream
        //System.out.println("Stream element");
      //  Stream.generate(() -> "hello").forEach(System.out::println);

        List<Book> bookList = List.of(new Book(10, "Java", "peter"),
                new Book(12, "OOP", "delchris"),
                new Book(14, "PYTHON", "delchris"));

//        Map<String,List<Book>>  bookByAuthorMap= bookList.stream().
//                collect(Collectors.toMap(Book::getBookAuthor, Function.identity()));
//        System.out.println("Books by Author toMap "+bookByAuthorMap);

           }
}

class Book {
    int bookId;
    String bookName;
    String bookAuthor;

    Book(int bookId, String name, String author) {
        this.bookId = bookId;
        this.bookName = name;
        this.bookAuthor = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
