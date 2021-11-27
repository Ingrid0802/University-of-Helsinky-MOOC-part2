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

public class BoxWithMaxWeight extends Box{
    
    private int maxWeight;
    private ArrayList<Item>items;

    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    public int itemsWeight(){
        int sum = 0;
        for(Item item : items){
            sum += item.getWeight();
        }
        return sum;
    }

    public void add(Item item){

        if(itemsWeight() + item.getWeight() <= maxWeight){
            items.add(item);
        }
    }

    public boolean isInBox(Item item){
        if(items.contains(item)){
            return true;
        }
        return false;
    }
}
