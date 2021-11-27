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

public class Hideout<T> {
    
    private List<T> elements;

    public Hideout(){
        this.elements = new ArrayList<>();
    }


    public void putIntoHideout(T toHide) {
        if (!(elements.isEmpty())) {
            elements.clear();
        }
        elements.add(toHide);
    }

    public T takeFromHideout(){
        T element = elements.get(0);
        elements.clear();
        return element;
    }

    public boolean isInHideout(){
        if(elements.isEmpty()){
            return false;
        }
        return true;
    }
    
}
