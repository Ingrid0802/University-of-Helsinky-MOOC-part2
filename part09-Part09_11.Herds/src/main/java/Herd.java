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
import java.util.List;

public class Herd implements Movable{
    
    private ArrayList<Movable> movables;

    public Herd(){
        this.movables = new ArrayList<>();
    }

    public String toString(){
        String st = "";
        for(Movable herd: movables){
            st += herd.toString() + "\n";
        }
        return st;
    }

    public void addToHerd(Movable movable){
        movables.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable herd : movables){
            herd.move(dx,dy);
        }
    }
}
