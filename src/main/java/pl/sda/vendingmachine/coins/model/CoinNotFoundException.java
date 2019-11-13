package pl.sda.vendingmachine.coins.model;

public class CoinNotFoundException extends RuntimeException {

    public CoinNotFoundException(String message) {
        super(message);
    }
}
