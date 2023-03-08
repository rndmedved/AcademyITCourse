package lesson14.builder;

public class Engine {
    private final int power;

    private final double volume;

    public Engine(int POWER, double VOLUME) {
        this.power = POWER;
        this.volume = VOLUME;
    }
    public void on(){
        System.out.println("Движек on");
    }
    public void off(){
        System.out.println("Движек off");
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
                "POWER=" + power +
                ", VOLUME=" + volume +
                '}';
    }
}
