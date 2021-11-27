/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class ProductWarehouse extends Warehouse{
    
    private String name;
 
    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return this.name + ": " + super.toString();
    }
 
}
