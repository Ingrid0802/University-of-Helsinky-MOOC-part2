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
import java.util.Map;

public class ShoppingCart {
    
    private Map<String, Item> productsInCart;

    public ShoppingCart(){
        this.productsInCart = new HashMap<>();
    }

    public void add(String product, int price){
        if(productsInCart.containsKey(product)){
            increaseQuantity(product);
        } else {
            productsInCart.put(product, new Item(product,1,price));
        }
    }

    public int price(){
        int totalPrice = 0;
        for(Item item : productsInCart.values()){
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void increaseQuantity(String product){
        this.productsInCart.get(product).increaseQuantity();
    }

    public void print(){
        for(Item item : productsInCart.values()){
            System.out.println(item);
        }
    }
}
