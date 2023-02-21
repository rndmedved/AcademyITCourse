package lesson9.testMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {
    static void showInfo(Map<String, Double> drinks){
        System.out.println("Имеются следующие напитки: ");
        for(Map.Entry<String, Double> item : drinks.entrySet()){
            System.out.printf("Кофе %s стоит %.2f\n", item.getKey(), item.getValue());
        }

    }


    public static void main(String[] args) throws IOException {
        Map<String, Double> coffeeMach =new HashMap<>();
        coffeeMach.put("Капучино", 100.00);
        coffeeMach.put("Латте", 120.00);
        coffeeMach.put("Американо", 80.00);
        boolean isEnough = false;
        int money = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        showInfo(coffeeMach);
        for(Map.Entry<String,Double> item: coffeeMach.entrySet()){
            if(money >= item.getValue()){
                System.out.println("Вы можете приобрести " + item.getKey());
                isEnough = true;

            }

        }
        if(!isEnough) System.out.println("Вам недостаточно средств.");

    }
}
