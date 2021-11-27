/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Ingrid
 *
 */

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    
    private List<Sensor> listOfSensors;
    private List<Integer> listOfAverage;

    public AverageSensor() {

        this.listOfSensors = new ArrayList<>();
        this.listOfAverage = new ArrayList<>();

    }

    public void addSensor(Sensor toAdd) {

        listOfSensors.add(toAdd);

    }

    @Override
    public boolean isOn() {

        boolean isOn = false;

        for (Sensor sensor : listOfSensors) {
            if (sensor.isOn() == true) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }

        }
        return isOn;

    }

    @Override
    public void setOn() {

        for (Sensor sensor : listOfSensors) {
            sensor.setOn();
        }

    }

    @Override
    public void setOff() {

        for (Sensor sensor : listOfSensors) {
            sensor.setOff();
        }

    }

    @Override
    public int read() {

        int sum = 0;
        if (isOn() && !listOfSensors.isEmpty()) {

            for (Sensor sensor : listOfSensors) {

                sum += sensor.read();
            }

            int average = sum / listOfSensors.size();

            listOfAverage.add(average);

            return average;

        } else {
            throw new IllegalArgumentException("error getting the average of sensors");
        }

    }

    public List<Integer> readings() {

        return listOfAverage;

    }
}
