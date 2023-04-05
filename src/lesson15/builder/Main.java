package lesson15.builder;

public class Main {
    public static void main(String[] args) {
        var car = new Car.Builder()
                .setTitle("Porshe")
                .setBody(Body.Color.WHITE,Body.Type.HATCHBACK)
                .setEngine(350,3.5)
                .setWheels(Wheels.Type.SUMMER,true)
                .build();
        car.startEngine();
        System.out.println(car);
        car.stopEngine();
    }
}
