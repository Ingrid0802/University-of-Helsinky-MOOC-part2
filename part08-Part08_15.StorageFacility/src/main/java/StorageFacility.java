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

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storings;

    public StorageFacility(){
        this.storings = new HashMap<>();
    }

    public void add(String unit, String item){
        storings.putIfAbsent(unit, new ArrayList<>());
        this.storings.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> emptyArray = new ArrayList<>();

        return storings.getOrDefault(storageUnit,emptyArray);
    }

    public void remove(String storageUnit, String item){

        this.storings.get(storageUnit).remove(item);

        if(this.storings.get(storageUnit).isEmpty()){
            this.storings.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> storingUnitsNames = new ArrayList<>();
        for(String name : storings.keySet()){
            storingUnitsNames.add(name);
        }
        return storingUnitsNames;
    }
}
