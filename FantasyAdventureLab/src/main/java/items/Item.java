package items;

public abstract class Item  {

    String type;

    public Item(String type) {
        this.type = type;
    }


    public String getName() {
        return type;
    }
}
