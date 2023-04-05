package lesson15.builder;

public class Engine {
    private final int power;//мощность двигателя
    private final double volume;//объем двигателя

    public Engine(int power, double volume) {
        this.power = power;
        this.volume = volume;
    }

    public void on(){
        System.out.println("Двигатель запущен");
    }

    public void off(){
        System.out.println("Двигатель выключен");
    }

    public int getPower() {
        return power;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", volume=" + volume +
                '}';
    }
}
