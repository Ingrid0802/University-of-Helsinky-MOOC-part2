
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("f.e.", "for example");
        hashMap.put("etc.", "and so on");
        hashMap.put("i.e.", "more precisely");

        printKeys(hashMap);

        System.out.println("---");
        printKeysWhere(hashMap,"i");

        System.out.println("---");
        printValuesOfKeysWhere(hashMap, ".e");
    }

    public static void printKeys(HashMap<String, String> hashMap){
        for(String str : hashMap.keySet()){
            System.out.println(str);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text){
        for(String str : hashMap.keySet()){
            if(str.contains(text)){
                System.out.println(str);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text){
        String key = "";
        for(String str : hashMap.keySet()){
            if(str.contains(text)){
                key = str;
                System.out.println(hashMap.get(key));
            }
        }
    }
}
