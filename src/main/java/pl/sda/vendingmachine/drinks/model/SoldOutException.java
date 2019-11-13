package pl.sda.vendingmachine.drinks.model;

public class SoldOutException extends RuntimeException {
    public SoldOutException(String message) {
        super(message);
    }
}
