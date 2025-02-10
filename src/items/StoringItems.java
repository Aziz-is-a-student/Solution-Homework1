package items;

import Enemyes.Enemy;

import java.util.List;

public interface StoringItems {
    List<Item> addItem(Item item);
    List<Item> removeItem(Item item);
    List<Item> clear();
}
