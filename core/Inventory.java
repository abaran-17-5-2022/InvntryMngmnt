import java.util.ArrayList;

class Inventory {
    ArrayList<Item> itemList;
    String id;

    protected Inventory() {
        itemList = new ArrayList<>();
    }

    protected void addItem(Item item) {
        itemList.add(item);
    }

    protected void removeItem(String itemId) {
        itemList.removeIf(item -> item.getId().equals(itemId));
    }

    protected String getId() {
        return id;
    }
}