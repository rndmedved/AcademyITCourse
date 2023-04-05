package lesson15.factory;
//Принцип SOLID инверсия зависимости (D)
public class FactoryMethod {
    public static Coffee createCoffee(TypeCoffee typeCoffee){
        switch (typeCoffee){
            case LATTE -> {
                return new Latte();
            }
            case AMERICANO -> {
                return new Americano();
            }
            case CAPPUCHINO -> {
                return new Cappuchino();
            }
        }
        return null;
    }
}
