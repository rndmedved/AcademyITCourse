package lesson15.builder;

public class Main {
    public static void main(String[] args) {
        var car = new Car.Builder()
                .setTitle("Porshe")
                .setBody(Body.Color.WHITE,Body.Type.HATCHBACK)
                .build();
        car.startEngine();
        System.out.println(car);
        car.stopEngine();
    }
}
