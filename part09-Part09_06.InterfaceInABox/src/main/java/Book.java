/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class Book implements Packable{
    
     private String author;
    private String nameOfBook;
    private double weight;

    public Book(String author, String nameOfBook, double weight){
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.weight = weight;
    }

    public double weight(){
        return this.weight;
    }

    public String toString(){
        return this.author + ": " + this.nameOfBook;
    }
}
