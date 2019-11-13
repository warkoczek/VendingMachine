package pl.sda.vendingmachine.drinks.model;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter

public enum Drink {

    PEPSI("PepsiMax", 2.5D), TEA("Hot Blueberry Tea", 3.5D),
    MILK("Skimmed milk", 3.0D), COFFEE("Hot Dark Coffee", 4.5D), WATER("Still Mountain Water",2.0D);

    private String name;
    private Double price;




}
