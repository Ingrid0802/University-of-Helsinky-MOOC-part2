/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class CustomTacoBox implements TacoBox{
    
     private int tacos;

    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }

    public void eat(){
        tacos = tacos -1;
    }

    public int tacosRemaining(){
        if(tacos < 0){
            return 0;
        }
        return this.tacos;
    }
}
