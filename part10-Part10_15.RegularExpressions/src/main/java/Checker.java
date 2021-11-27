

public class Checker {

    public boolean isDayOfWeek(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
          //  System.out.println("The form is correct.");
            return true;
        }
        //System.out.println("The form is incorrect.");
        return false;
    }

    public boolean allVowels(String string){
        if(string.matches("^[aeiou]*")){
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string){
        if (string.matches("(?:[01]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)")) {    //:? to not cap ':' only in parthese group
            return true;
        }
        return false;
    }
}
