
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         ArrayList<String> inputs = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if(Integer.valueOf(input) < 0){
                break;
            }
            inputs.add(input);
        }

        inputs.stream()
                .mapToInt(value ->Integer.valueOf(value))
                .filter(value -> value >= 1 && value <= 5)
                .forEach(value -> System.out.println(value));

    }
}
