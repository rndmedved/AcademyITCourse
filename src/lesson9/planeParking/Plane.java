package lesson9.planeParking;

public class Plane {
    private String title;
    private int number;

    public Plane(String title, int number) {
        this.title = title;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Самолет: "+ title + " номер: " + number;
    }
}
