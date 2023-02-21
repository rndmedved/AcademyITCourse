package factory;


public class Order {
    private Factory factory;
    private   int count;
    private String[] models;
    private int commonSum = 0; //общая сумма заказа
    private Car[] cars;//Это фура под кол-во машин
    Diller diller;

    public Order(Factory factory, int count, String[] models, Diller diller) {
        this.factory = factory;
        this.count = count;
        this.models = models;
        this.diller = diller;
        cars = new Car[count];
        startOrder();
    }

    void showInfoOrder() {
        for (Car car : cars) {
            if (car != null) {
                System.out.println("Автомобиль " + car.getTitleCar() + " стоит " + car.getPrice());
            }
        }
        System.out.println("Общая стоимость заказа " + commonSum);
    }

    private void startOrder() {
        if(diller.getAgeDiller()>10){
            System.out.println("Диллер получает бонус от завода - "+factory.DILLER_BONUS+ "%.");
        }
        String modelCar;
        for (int i = 0; i < count; i++) {
            modelCar = models[(int) (Math.random() * models.length)];
            if (isExist(factory.getListCars(), modelCar)) {
                cars[i] = factory.createCar(modelCar);
                if (diller.getAgeDiller() > 10){
                    cars[i].setPrice(cars[i].getPrice()*(100-factory.DILLER_BONUS)/100);
                }
                commonSum += cars[i].getPrice();

            } else {
                System.out.println("Невозможно создать автомобиль.");
            }
        }

    }

    /**
     * Method checked String[] "arr" if its contain String value "a"
     * @param arr
     * @param a
     * @return
     */
    private static boolean isExist(String[] arr, String a) {
        boolean result = false;
        for (String s : arr) {
            result = result || s.equals(a);
        }
        return result;
    }

}
