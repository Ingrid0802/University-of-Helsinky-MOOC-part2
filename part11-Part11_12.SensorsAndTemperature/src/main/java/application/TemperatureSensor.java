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
import java.util.Random;

public class TemperatureSensor implements Sensor{
    
     private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {

        return isOn;

    }

    @Override
    public void setOn() {

        if (!isOn) {

            isOn = true;
        }

    }

    @Override
    public void setOff() {

        if (isOn) {

            isOn = false;
        }

    }

    @Override
    public int read() {
        
        if(isOn){
        Random rand = new Random();
 
        return rand.nextInt(61) - 30;
        } else {
            throw new IllegalArgumentException("error reading temp sens");
        }

    }
}
