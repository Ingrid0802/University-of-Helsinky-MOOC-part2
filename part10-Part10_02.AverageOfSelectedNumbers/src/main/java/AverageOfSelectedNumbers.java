import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");

        List<String> numbers = new ArrayList<>();

        while (true){
            String value = scanner.nextLine();
            if(value.equals("end")){
                break;
            }
            numbers.add(value);
        }

        System.out.println("Print the average of the negative numbers or positive numbers?");
        System.out.println("(n/p)");
        String num = scanner.nextLine();
        if(num.equals("n")){
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average().getAsDouble();

            System.out.println("average of the negative numbers: " + average);
        }

        if(num.equals("p")){
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average().getAsDouble();

            System.out.println("average of the positive numbers: " + average);
        }

    }
}
