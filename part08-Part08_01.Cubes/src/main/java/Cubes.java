
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String number = scanner.nextLine();
            if(number.equals("end")){
                break;
            }
            int num = Integer.valueOf(number);
            printCubes(num);
        }

    }

    public static void printCubes(int number){
        System.out.println(number * number * number);
    }
}
