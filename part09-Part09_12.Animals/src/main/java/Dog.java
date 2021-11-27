/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class Dog extends Animal implements NoiseCapable{
    
    private String name;

    public Dog(String name){
        super(name);
    }

    public Dog(){
        super("Dog");
    }

    public void bark(){
        System.out.println(super.getName() + " barks");
    }

//    public void eat(){
//        super.eat();
//    }
//
//    public void sleep(){
//        super.sleep();
//    }

    public void makeNoise(){
        bark();
    }
    
}
