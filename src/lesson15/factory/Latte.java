package lesson15.factory;

public class Latte extends Coffee{
    Latte(){
        grindCoffee();
        makeCoffee();
        passCoffee();
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        System.out.println("Добавим много молока.");
    }
}
