
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true){
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Input age recommendation:");
            int age = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(name,age));
        }

        System.out.println(books.size() + " books in total.");

        System.out.println("Books:");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        books.stream()
                .forEach(book -> System.out.println(book));

    }

}


