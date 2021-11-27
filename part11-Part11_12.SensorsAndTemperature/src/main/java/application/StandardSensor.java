/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Ingrid
 */
public class StandardSensor implements Sensor{
    
    private int value;

    public StandardSensor(int value){
        this.value = value;
    }

    public boolean isOn(){
        return true;
    }

    public void setOn(){
        return;
    }

    public void setOff(){
        return;
    }

    public int read(){
//        if(isOn()){
//            return this.value;
//        } else{
//            throw new IllegalStateException("The sensor must be on.");
//        }
          return this.value;
    }
     
}
