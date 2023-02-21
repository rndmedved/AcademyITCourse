package university;

public class Student {
    private String name;
    private int stage;
    private double GPA;

    public Student(String name) {
        if (name!=null) {
            this.name = name;
        } else {
            this.name = "Unnamed Student";
        }
        int stage = (int) Math.round(Math.random() * 5);
        this.stage = stage;
        double GPA =  5 - Math.random() * 2;
        this.GPA = GPA;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getStage() {
        return stage;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        String s;
        s = String.format("Студент %s, учится на %d курсе, имеет средний балл %.2f", name, stage, GPA);
        return s;
    }
}

