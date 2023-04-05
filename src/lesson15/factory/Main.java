package lesson15.factory;

public class Main {
    public static void main(String[] args) {
        var coffee = new StoreCoffee().makeOrder(TypeCoffee.AMERICANO);
    }
}
