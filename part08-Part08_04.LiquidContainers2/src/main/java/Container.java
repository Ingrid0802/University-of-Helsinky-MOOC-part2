/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class Container {
    
    private int containerValue;

    public Container(){
        this.containerValue = 0;
    }

    public int contains(){
        return this.containerValue;
    }

    public void add(int amount){
        if (amount > 0) {
            this.containerValue += amount;
            if (this.containerValue > 100) {
                this.containerValue = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.containerValue -= amount;
            if (this.containerValue < 0) {
                this.containerValue = 0;
            }
        }
    }

    public String toString(){
        return containerValue + "/100";
    }
}
