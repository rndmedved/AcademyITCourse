package lesson9.students;

import java.util.Random;

public class Student {
    private int ID;
    private String name;
    private Double GPA;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
        this.GPA = new Random().nextDouble(2) + 3;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return String.format("Студент id: %d, ФИО: %s, средний бал: %.2f", ID, name, GPA );
    }
}
