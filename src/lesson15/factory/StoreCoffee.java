package lesson15.factory;

public class StoreCoffee {


    public Coffee makeOrder(TypeCoffee typeCoffee){
        Coffee coffee= FactoryMethod.createCoffee(typeCoffee);
        if (coffee!=null){
            System.out.println("Ваш кофе "+ typeCoffee+" готов.");
            return coffee;
        }else{
            System.out.println("Данный напиток мы не можем изготовить");
            return null;
        }
    }
}
