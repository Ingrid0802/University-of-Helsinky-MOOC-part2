/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    
     private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        dictionary.putIfAbsent(word, new ArrayList<String>());

        //        ArrayList<String> translationsArrayList = this.translationHashMap.get(word);       //defines the arraylist
        //        translationsArrayList.add(word);                                            //adds to the arraylist
        this.dictionary.get(word).add(translation);   //should do all the above in one line
    }

    public ArrayList<String> translate(String word){
        ArrayList<String> emptyArray = new ArrayList<>();

        if(dictionary.get(word) == null){
            return emptyArray;
        }

       // return this.dictionary.getOrDefault(word, emptyList);

        return dictionary.get(word);
    }

    public void remove(String word){
        dictionary.remove(word,dictionary.get(word));
    }
}
