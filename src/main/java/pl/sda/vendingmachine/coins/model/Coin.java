package pl.sda.vendingmachine.coins.model;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter

public enum Coin {

    FIFTY(0.5D), ONE(1.0D), TWO(2.0D), FIVE(5.0D);

    private Double denomination;


}
