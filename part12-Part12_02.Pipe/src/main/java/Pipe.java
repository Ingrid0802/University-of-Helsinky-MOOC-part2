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

public class Pipe<T> {
    private List<T> elements;

    public Pipe(){
        this.elements = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        elements.add(value);
    }

    public T takeFromPipe(){
        if(elements.isEmpty()){
            return null;
        } else {
            T element = elements.get(0);
            elements.remove(element);
            return element;
        }
    }

    public boolean isInPipe(){
        if(!(elements.isEmpty())){
            return true;
        }
        return false;
    }
}
