package items;

import Player.Player;

import java.util.List;

public class ItemManager implements PickUpItem,StoringItems {
    private  Player player;
    private  Item item;
    private  Items items;
    private Inventory  inventory;

    public ItemManager(Player player, Item item, Items items, Inventory inventory) {
        this.player = player;
        this.item = item;
        this.items = items;
        this.inventory = inventory;
    }
    @Override
    public List addItem(Item item) {
        items.getItems().add(item);
        return items.getItems() ;
    }

    @Override
    public List<Item> removeItem(Item item) {
        items.getItems().remove(item);
        return items.getItems();
    }

    /*@Override
    public List<Item> removeItems(List<Item> itemsToRemove) {
        items.getItems().removeAll(itemsToRemove);
        return items.getItems() ;
    }*/

    @Override
    public List<Item> clear() {
        items.getItems().clear();
        return items.getItems();
    }

    @Override
    public void pickUpItem(Item item) {

        System.out.println(player.getPlayerName() + " picks up " + item + ".");
        player.setPlayerExperience(player.getPlayerExperience() + item.getExperience());
        player.setPlayerHealth(player.getPlayerHealth()+ item.getHealling());

        removeItem(item);
        inventory.addItem(item);
        System.out.println("Inventory now: " + inventory);
    }

}
