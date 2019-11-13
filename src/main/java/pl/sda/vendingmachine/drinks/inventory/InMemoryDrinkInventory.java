package pl.sda.vendingmachine.drinks.inventory;

import pl.sda.vendingmachine.drinks.model.Drink;
import pl.sda.vendingmachine.drinks.model.NoSuchDrinkException;
import pl.sda.vendingmachine.drinks.model.SoldOutException;


import java.util.HashMap;
import java.util.Map;


public class InMemoryDrinkInventory implements DrinkInventory {

    private Map<Drink, Integer> drinkInventory;

    public InMemoryDrinkInventory() {

        drinkInventory = new HashMap<>();
    }

    @Override
    public void initialize() {

        for(Drink d : Drink.values()){
            drinkInventory.put(d,5);
        }
    }

    @Override
    public Integer getQuantity(Drink drink) {
        //In case quantity is null I would like it to render(return) 0
         /*Integer quantity = drinkInventory.entrySet().stream()
                .filter(d -> d.getKey().getName().equals(drink.getName()))
                .map(Map.Entry :: getValue)
                .findFirst().orElseThrow(() -> new SoldOutException("This drink is sold out!"));

        return quantity;*/
        Integer value = drinkInventory.get(drink);

        return value == null? 0 : value;
    }

    @Override
    public void add(Drink drink) {

        Integer quantity = drinkInventory.entrySet().stream()
                .filter(d -> d.getKey().getName().equals(drink.getName()))
                .map(Map.Entry :: getValue)
                .findFirst().orElseThrow(() -> new NoSuchDrinkException("No such a drink exception"));

        drinkInventory.put(drink,quantity+1);

    }

    @Override
    public void deduct(Drink drink) {

        Integer quantity = drinkInventory.entrySet().stream()
                .filter(d -> d.getKey().getName().equals(drink.getName()))
                .map(Map.Entry :: getValue)
                .findFirst().orElseThrow(() -> new SoldOutException("This drink is sold out"));

        if(hasDrink(drink)) {
            drinkInventory.put(drink, quantity - 1);
        }
    }

    @Override
    public boolean hasDrink(Drink drink) {

        return getQuantity(drink) > 0;
    }

    @Override
    public void clear() {

        drinkInventory.clear();

    }

    @Override
    public void put(Drink drink, Integer quantity) {

        drinkInventory.put(drink,quantity);

    }


}
