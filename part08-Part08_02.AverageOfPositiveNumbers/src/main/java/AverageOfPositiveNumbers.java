
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0.0;
        int sum = 0;
        int count = 0;

        while (true){
            int number = scanner.nextInt();

            if(number == 0){
                break;
            }
            if( number > 0){
                sum += number;
                count++;
                average = (double) sum / count;
            }

        }

        if(count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }

    }
}

