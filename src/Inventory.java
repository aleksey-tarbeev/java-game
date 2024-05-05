import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Item> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    // Метод для добавления предмета в инвентарь
    public void addItem(Item item) {
        String itemName = item.getName();
        if(items.containsKey(itemName)) {
            items.get(itemName).increaseQuantity();
        } else {
            items.put(itemName, item);
        }
    }

    // Метод для удаления предмета из инвентаря
    public void removeItem(String itemName) {
        if(items.containsKey(itemName)) {
            Item item = items.get(itemName);
            if(item.getQuantity() > 1) {
                item.decreaseQuantity();
            } else {
                items.remove(itemName);
            }
        } else {
            System.out.println("Предмет не найден в инвентаре.");
        }
    }

    // Метод для получения предмета из инвентаря
    public Item getItem(String itemName) {
        return items.getOrDefault(itemName, null);
    }

    // Метод для вывода всех предметов в инвентаре
    public void displayItems() {
        for (Item item : items.values()) {
            System.out.println(item.getName() + " x" + item.getQuantity());
        }
    }
}