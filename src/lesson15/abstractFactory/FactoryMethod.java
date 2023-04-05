package lesson15.abstractFactory;

public class FactoryMethod {
    public static AbstractFactory getFactory(int numberOrder){
        if(numberOrder == 1){
            return new ComboSetFirst();
        } else if(numberOrder == 2){
            return new ComboSetSecond();
        }
        return null;
    }
}
