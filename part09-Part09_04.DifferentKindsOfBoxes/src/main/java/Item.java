
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Item)) {
            return false;
        }
        Item comparedItem = (Item) obj;
        if(this.name.equals(comparedItem.name)){
                return true;
        }
        return false;
    }

    public int hashCode(){
        int hash = 5;
        hash = 19 * hash + this.name.hashCode();
        return hash;
    }

}
