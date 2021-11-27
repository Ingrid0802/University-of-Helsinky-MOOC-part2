
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue = 0;
        int secondValue = 0;
        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");
        while (true){
            String command = scanner.nextLine();
            if(command.equals("quit")){
                break;
            }

            String[] command1 = command.split(" ");
            String firstCommand = command1[0];
            int valueOfCommand = Integer.valueOf(command1[1]);
            if(valueOfCommand > 0){
                if(firstCommand.equals("add") && (valueOfCommand + firstValue <= 100) ){
                    firstValue += valueOfCommand;
                } else if(firstCommand.equals("add") && valueOfCommand + firstValue > 100){
                    firstValue = 100;
                }

                if(firstCommand.equals("move") && (valueOfCommand < firstValue)){
                    if(secondValue + valueOfCommand <= 100){
                        firstValue -= valueOfCommand;
                        secondValue += valueOfCommand;
                    } else if(secondValue + valueOfCommand > 100){
                        firstValue -= valueOfCommand;
                        secondValue = 100;
                    }

                } else if(firstCommand.equals("move") &&  (valueOfCommand >= firstValue)) {
                    if(secondValue + valueOfCommand <= 100){
                        secondValue += firstValue;
                        firstValue -= firstValue;
                    } else if(secondValue + valueOfCommand > 100){
                        secondValue = 100;
                        firstValue -= firstValue;
                    }
                }

                if(firstCommand.equals("remove") && secondValue - valueOfCommand >= 0){
                    secondValue -= valueOfCommand;
                } else if(firstCommand.equals("remove") && secondValue - valueOfCommand < 0){
                    secondValue -= secondValue;
                }
            }
            System.out.println("First: " + firstValue + "/100");
            System.out.println("Second: " + secondValue + "/100");
        }

    }

}
