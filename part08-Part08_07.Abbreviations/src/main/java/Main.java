
public class Main {

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precicesly");

        String text = "e.g. i.e. etc. lol";
        for(String part: text.split(" ")){
            if(abbreviations.hasAbbreviation(part)){
                part = abbreviations.findExplanationFor(part);
            }
            System.out.println(part);
            System.out.println(" ");
        }
        System.out.println();
    }
}
