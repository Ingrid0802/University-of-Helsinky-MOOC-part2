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
import java.util.HashMap;

public class VehicleRegistry {
    
        private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry(){
        this.vehicles = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(!(vehicles.containsKey(licensePlate))){
            vehicles.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    public String get(LicensePlate licensePlate){
        return vehicles.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if(vehicles.containsKey(licensePlate)){
            vehicles.remove(licensePlate,vehicles.get(licensePlate));
            return true;
        }
        return false;

    }

    public void printLicensePlates(){
        for(LicensePlate licensePlate : vehicles.keySet()){
            System.out.println(licensePlate);
        }
    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String owner : vehicles.values()){
            if(!(owners.contains(owner))){
                owners.add(owner);
            }
        }
        for(String owner : owners){
            System.out.println(owner);
        }
    }
}
