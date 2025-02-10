package items;

import Player.Player;

public class ItemManager implements PickUpItem {
    private  Player player;
    private  Item item;

    public ItemManager(Player player, Item item) {
        this.player = player;
        this.item = item;
    }

    @Override
    public void pickUpItem(Item item) {

        System.out.println(player.getPlayerName() + " picks up " + item + ".");
        player.setPlayerExperience(player.getPlayerExperience() + item.getExperience());
        player.setPlayerHealth(player.getPlayerHealth()+ item.getHealling());

        /*items.remove(item);
        System.out.println("Inventory now: " + inventory);*/
    }
}
