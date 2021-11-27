/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class Cat extends Animal implements NoiseCapable{
    
    private String name;

    public Cat(String name){
        super(name);
    }

    public Cat(){
        super("Cat");
    }

//    public void sleep(){
//        super.sleep();
//    }
//
//    public void eat(){
//        super.eat();
//    }

    public void purr(){
        System.out.println(super.getName() + " purrs");
    }

    public void makeNoise(){
        purr();
    }
}
