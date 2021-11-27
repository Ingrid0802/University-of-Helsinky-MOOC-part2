/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
import java.util.HashMap;
public class IOU {
    
    private HashMap<String, Double> amount;

    public IOU(){
        this.amount = new HashMap<>();
    }

    public void setSum(String toWhom, double sum){
        amount.put(toWhom, sum);
    }

    public double howMuchDoIOweTo(String toWhom){
        return this.amount.getOrDefault(toWhom, 0.0);
    }
}
