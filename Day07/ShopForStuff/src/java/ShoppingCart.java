
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ShoppingCart {
    private List<InventoryItem> items;

    public ShoppingCart() {
        this.items = new ArrayList();
    }

    public List<InventoryItem> getItems() {
        return items;
    }
    
    public void addItem(InventoryItem item) {
        this.items.add(item);
    }
    
    public Money getTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (InventoryItem item : items) {
            BigDecimal amount = item.getPrice().getAmount();
            total = total.add(amount);
        }
        return new Money(total, Money.USD);
    }
}
