import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public void manageInventory(String item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
    }
    public void manageInventory(String item) {
        inventory.remove(item);
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}
