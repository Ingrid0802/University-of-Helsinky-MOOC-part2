/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String>todos;

    public TodoList(){
        this.todos = new ArrayList<>();
    }

    public void add(String task){
        todos.add(task);
    }

    public void print(){
        int number = 0;
        for(int i = 0; i < todos.size(); i++){
            System.out.println( number + 1 + i + ": " + todos.get(i));
        }
    }

    public void remove(int number){
        int index = number - 1;
        todos.remove(index);
    }
    
}
