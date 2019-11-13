package pl.sda.vendingmachine.drinks.model;

public class NoSuchDrinkException extends RuntimeException {
    public NoSuchDrinkException(String message) {
        super(message);
    }
}
