package lesson5.factory;

public class Car {
    private String titleCar;
    private int price;

    public Car(String titleCar, int price) {
        this.titleCar = titleCar;
        this.price = price;
    }

    public String getTitleCar() {
        return titleCar;
    }

    public void setPrice(int price) {
        if (price < 100) {
            this.price = 100;
        } else {this.price = price;}
    }

    public int getPrice() {
        return price;
    }
}
