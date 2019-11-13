package pl.sda.vendingmachine.purchases;


import pl.sda.vendingmachine.coins.inventory.CoinInventory;
import pl.sda.vendingmachine.coins.inventory.InMemoryCoinInventory;
import pl.sda.vendingmachine.drinks.inventory.DrinkInventory;
import pl.sda.vendingmachine.drinks.inventory.InMemoryDrinkInventory;
import pl.sda.vendingmachine.drinks.model.Drink;

public class Purchase implements PurchaseInterface {

    private DrinkInventory drinkInventory = new InMemoryDrinkInventory();
    private CoinInventory coinInventory = new InMemoryCoinInventory();

    public Purchase() {
        drinkInventory.initialize();
        coinInventory.initialize();
    }

    @Override
    public Double selectDrinkAndGetPrice(Drink drink) {


        return null;
    }
}

