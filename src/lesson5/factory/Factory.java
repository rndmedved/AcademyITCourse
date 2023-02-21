package lesson5.factory;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    public final int DILLER_BONUS = 10;
    private String titleFactory;
    private String[] listCars;

    private Map<String, Integer> countConstructedModels = new HashMap<>();


    Car createCar(String titleCar) {
        Car car;
        System.out.println("Завод приступил к постройке автомобиля.");
        car = new Car(titleCar, (int) Math.round(Math.random() * 4000 + 1000));
        if (countConstructedModels.containsKey(car.getTitleCar())) {
            countConstructedModels.put(car.getTitleCar(), countConstructedModels.get(car.getTitleCar()) + 1);
        } else {
            countConstructedModels.put(car.getTitleCar(), 1);
        }
        return car;
    }

    /**
     * Метод показывает количество созданных автомобилей по моделям.
     */
    public void getCountConstructedModels(){
        for(Map.Entry<String, Integer> models: countConstructedModels.entrySet()){
            System.out.println("Количество созданных моделей " + models.getKey() + " = "+ models.getValue());
        }
    }
    public String getTitleFactory() {
        return titleFactory;
    }

    public String[] getListCars() {
        return listCars;
    }

    public Factory(String titleFactory, String[] listCars) {
        this.titleFactory = titleFactory;
        this.listCars = listCars;
        System.out.println("Завод может изготовить следующие авто:");
        for (String car : listCars) {
            System.out.println(car);
        }
    }

    public void setListCars(String[] listCars) {
        this.listCars = listCars;
    }
}
