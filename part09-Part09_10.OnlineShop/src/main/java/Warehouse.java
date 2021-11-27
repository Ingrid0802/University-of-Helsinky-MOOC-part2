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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;
 //   private Set<String> productNames;

    public Warehouse() {
        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    //    this.productNames = new HashSet<>();

    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        return products.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {

        if (this.stock(product) > 0) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products(){
        Set<String> productNameSet = new HashSet<>();

        for (String key : products.keySet()) {

            productNameSet.add(key);

        }
        return productNameSet;
    }
}
