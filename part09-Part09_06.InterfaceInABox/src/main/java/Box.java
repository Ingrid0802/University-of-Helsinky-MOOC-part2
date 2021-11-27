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

public class Box implements Packable{
    
    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item){
            if(item.weight() + this.weight() <= maxCapacity){
                items.add(item);
            }
    }

    public double weight(){
        double weight = 0;
        for(Packable packables : items){
            weight += packables.weight();
        }
        return weight;
    }

    public String toString(){
        return "Box: " + items.size() + " items" + ", total weight " + weight() + " kg";
    }
}
