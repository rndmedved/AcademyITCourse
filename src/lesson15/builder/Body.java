package lesson15.builder;

public class Body {
    enum Color{
        BLACK,
        YELLOW,
        WHITE,
        SILVER
    }

    enum Type{
        SEDAN,
        HATCHBACK,
        LIFTBACK,
        PICKUP
    }
    private final Color color;//final требует инициализации
    private final Type type;

    public Body(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Body{" +
                "color=" + color.name() +
                ", type=" + type.name() +
                '}';
    }
}
