package pl.sda.vendingmachine.purchases;

import pl.sda.vendingmachine.bucket.Bucket;
import pl.sda.vendingmachine.coins.model.Coin;
import pl.sda.vendingmachine.drinks.model.Drink;

import java.util.List;

public interface PurchaseInterface {

    Double selectDrinkAndGetPrice(Drink drink);

    void insertCoin(Coin coin);

    List<Coin> refund();

    Bucket<Drink,List<Coin>> collectDrinkAndChange();

    void reset();



}
