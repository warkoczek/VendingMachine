package pl.sda.vendingmachine.coins.inventory;


import pl.sda.vendingmachine.coins.model.Coin;


import java.util.HashMap;
import java.util.Map;


public class InMemoryCoinInventory implements CoinInventory {

    private Map<Coin, Integer> coinInventory;

    public InMemoryCoinInventory() {

        coinInventory = new HashMap<>();
    }

    @Override
    public void initialize() {
        /*Arrays.stream(Coin.values())
                .map(c -> coinInventory.put(c,5));*/
        for(Coin c : Coin.values()){
            coinInventory.put(c,5);
        }
    }

    @Override
    public Integer getQuantity(Coin coin) {

        Integer value = coinInventory.get(coin);

        return value == null? 0 : value;
    }

    @Override
    public void add(Coin coin) {

    }

    @Override
    public void deduct(Coin coin) {

    }

    @Override
    public boolean hasCoin(Coin coin) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void put(Coin coin, int quantity) {

    }

    public static void main(String[] args) {
        InMemoryCoinInventory inventory = new InMemoryCoinInventory();

        inventory.initialize();

        Integer quantity = inventory.getQuantity(Coin.FIFTY);
        System.out.println(quantity);
    }
}
