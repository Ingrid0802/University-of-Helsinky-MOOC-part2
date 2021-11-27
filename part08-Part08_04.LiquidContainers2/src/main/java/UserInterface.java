/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
import java.util.Scanner;
public class UserInterface {
    
    private Container container1;
    private Container container2;
    private Scanner scanner;

    public UserInterface(Container container1, Container container2, Scanner scanner){
        this.container1 = container1;
        this.container2 = container2;
        this.scanner = scanner;
    }

    public void start(){
        System.out.println("First: " + this.container1);
        System.out.println("Second: " + this.container2);
        while (true){
            String input = scanner.nextLine();
            if(input.equals("quit")){
                break;
            }
            String[] commands = input.split(" ");
            String command = commands[0];
            int value = Integer.valueOf(commands[1]);
            if(command.equals("add")){
                container1.add(value);
            } else if(command.equals("remove")){
                container2.remove(value);
            } else if(command.equals("move")){
                this.move(value);
            }
            System.out.println("First: " + this.container1);
            System.out.println("Second: " + this.container2);

        }
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount > this.container1.contains()) {
                this.container2.add(this.container1.contains());
                this.container1.remove(amount);
            } else {
                this.container1.remove(amount);
                this.container2.add(amount);
            }
        }
    }
}
