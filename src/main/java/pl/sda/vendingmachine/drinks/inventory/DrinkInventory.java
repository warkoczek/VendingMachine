package pl.sda.vendingmachine.drinks.inventory;

import pl.sda.vendingmachine.drinks.model.Drink;

public interface DrinkInventory {

    void initialize();

    Integer getQuantity(Drink drink);

    void add(Drink drink);

    void deduct(Drink drink);

    boolean hasDrink(Drink drink);

    void clear();

    void put(Drink drink, Integer quantity);
}
