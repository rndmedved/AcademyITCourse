package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String models[] = {"Гранта", "Веста", "Нива","Ларгус", "bmv"};
        String modelsFactory[] = {"Гранта", "Веста", "Нива", "Ларгус"};
        Factory factory = new Factory("Автоваз", modelsFactory);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сколько автомобилей нужно заказать?");
        int count = Integer.parseInt(reader.readLine());
        Diller diller = new Diller("Elvis", 20);
        diller.makeOrder(factory, count, models);
        factory.getCountConstructedModels();
        reader.close();
    }
}
