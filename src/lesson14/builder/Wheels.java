package lesson14.builder;

public class Wheels {
    enum Type{
        WINTER,
        SUMMER
    }
    private final Type type;
    private final boolean isLowerProfile;

    public Wheels(Type type, boolean isLowerProfile) {
        this.type = type;
        this.isLowerProfile = isLowerProfile;
    }

    public boolean isLowerProfile() {
        return isLowerProfile;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "type=" + type.name() +
                ", isLowerProfile=" + (isLowerProfile? "Низкий профиль ": "Нормальный профиль ") +
                '}';
    }
}
