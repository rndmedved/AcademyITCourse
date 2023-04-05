package lesson15.abstractFactory;

public class ComboSetSecond extends AbstractFactory{

    @Override
    public Food createFood() {
        return new Food("Pizza");
    }

    @Override
    public Drink createDrink() {
        return new Drink("Tea");
    }
}
