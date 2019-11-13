package pl.sda.vendingmachine.payment.changecalculator;

import pl.sda.vendingmachine.coins.model.Coin;
import pl.sda.vendingmachine.purchases.Purchase;

public interface ChangeCalculator {

    Coin getChange(Purchase purchase);
}
