import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String scan = scanner.nextLine();
            if (scan.equals("end")) {

                double average = numbers.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .average()
                        .getAsDouble();

                System.out.println("Average of the numbers: " + average);
                break;
            }
            numbers.add(scan);

        }

    }
}
