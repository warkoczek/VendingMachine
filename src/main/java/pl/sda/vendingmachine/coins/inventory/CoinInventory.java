package pl.sda.vendingmachine.coins.inventory;

import pl.sda.vendingmachine.coins.model.Coin;

public interface CoinInventory {

    void initialize();

    Integer getQuantity(Coin coin);

    void add(Coin coin);

    void deduct(Coin coin);

    boolean hasCoin(Coin coin);

    void clear();

    void put(Coin coin, int quantity);
}
