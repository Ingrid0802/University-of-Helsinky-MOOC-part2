
import java.util.HashMap;

public class Program {

     public static void main(String[] args) {

        HashMap<String, Book> hashMap = new HashMap<>();
        hashMap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashMap.put("prejudice", new Book("Pride and prejudice", 1813, "..."));

        printValues(hashMap);
        System.out.println("---");

        printValueIfNameContains(hashMap, "prejud");
    }

    public static void printValues(HashMap<String, Book> hashMap){
        for(Book book : hashMap.values()){
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text){
        for(Book book : hashMap.values()){
            if(book.getName().contains(text)){
                System.out.println(book);
            }
        }
    }
}
