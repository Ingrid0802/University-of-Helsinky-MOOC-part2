/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class CD implements Packable{
    
    private String artist;
    private String cdName;
    private int publicationYear;
    private double weight;

    public CD(String artist, String cdName, int publicationYear){
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    public double weight(){
        return this.weight;
    }

    public String toString(){
        return this.artist + ": " + this.cdName + " (" + publicationYear + ")";
    }
}
