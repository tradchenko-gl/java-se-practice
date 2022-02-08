package buchalka.section12.challenges.stockItems;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dev on 17/02/2016.
 */
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }


    //Updated by Tetiana Radchenko
    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            item.reserveItem(quantity);
            return inBasket;
        }
        return 0;
    }

    //Created by Tetiana Radchenko
    public boolean removeFromBasket(StockItem item, int quantity) {
        if((item != null) && (quantity > 0)) {
            if(list.containsKey(item)) {
                if(list.get(item) >= quantity) {
                    int newQuantity = list.get(item) - quantity;
                    if (newQuantity > 0) {
                        list.put(item, newQuantity);
                    } else if(newQuantity == 0) {
                        list.remove(item);
                    }
                    item.unreserveItem(quantity);
                    return true;
                } else System.out.println("Cannot remove more than " + list.get(item));
            }
        }
        return false;
    }

    //Created by Tetiana Radchenko
    public boolean checkOut() {
        if (this.list != null) {
            for (Map.Entry<StockItem, Integer> entry : list.entrySet()) {
                StockItem item = entry.getKey();
                int itemsQuantity = entry.getValue();

                item.unreserveItem(itemsQuantity);
                item.adjustStock(-itemsQuantity);
            }
            list.clear();
            return true;
        }
            return false;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
