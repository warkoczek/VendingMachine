package pl.sda.vendingmachine.drinks.inventory;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.vendingmachine.drinks.model.Drink;

public class InMemoryDrinkInventoryTest {

    private InMemoryDrinkInventory inventory = new InMemoryDrinkInventory();

    @Test
    public void getQuantityShouldReturn5() {

        //given
        inventory.put(Drink.COFFEE,null);
        inventory.put(Drink.MILK,5);
        inventory.put(Drink.PEPSI,5);

        Integer expectedResult = 0;

        //when
        Integer result = inventory.getQuantity(Drink.COFFEE);

        //then
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void addShouldReturnQuantity6AfterAddingQuantity1() {

        //given
        inventory.put(Drink.COFFEE,5);
        inventory.put(Drink.MILK,5);
        inventory.put(Drink.PEPSI,5);

        Integer expectedResult = 1;

        //when
        inventory.add(Drink.MILK);
        Integer result = inventory.getQuantity(Drink.MILK);

        //then
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void deduct() {

        //given
        inventory.put(Drink.COFFEE,0);
        inventory.put(Drink.MILK,5);
        inventory.put(Drink.PEPSI,5);

        Integer expectedResult = 0;
        //when
        inventory.deduct(Drink.COFFEE);
        Integer result = inventory.getQuantity(Drink.COFFEE);

        //then
        Assert.assertEquals(expectedResult,result);


    }

    @Test
    public void hasDrink() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void put() {

        //given
    }
}