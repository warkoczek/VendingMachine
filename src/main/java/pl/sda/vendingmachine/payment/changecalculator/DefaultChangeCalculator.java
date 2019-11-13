package pl.sda.vendingmachine.payment.changecalculator;


import pl.sda.vendingmachine.coins.model.Coin;

import pl.sda.vendingmachine.purchases.Purchase;

public class DefaultChangeCalculator implements ChangeCalculator{

    @Override
    public Coin getChange(Purchase purchase) {
        return null;
    }
}
