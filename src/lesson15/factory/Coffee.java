package lesson15.factory;

public class Coffee {
    public void grindCoffee(){
        System.out.println("Идет перемалывание зерен");
    }
    public void makeCoffee(){
        System.out.println("Идет этап пригтовления кофе");
    }
    public void passCoffee(){
        System.out.println("Завершающий этап");
    }
}
