package items;

import java.util.List;

public class Inventory implements StoringItems{
    private List<Item> inventory;


    public Inventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    @Override
    public List addItem(Item item) {
        inventory.add(item);
        return inventory ;
    }

    @Override
    public List<Item> removeItem(Item item) {
        inventory.remove(item);
        return  inventory ;
    }

    @Override
    public List<Item> clear() {

        inventory.clear();
        return inventory ;
    }

    /*  @Override
    public List<Item> removeItems(List<Item> items) {
        inventory.removeAll(items);
        return inventory ;
    }*/
}
