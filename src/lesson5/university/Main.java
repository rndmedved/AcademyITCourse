package lesson5.university;

public class Main {
    static String[] studentNames = {"Вася", "Маша", "Оля", "Петя", "Коля", "Алина", null, "Вера","Андрей"};
    public static void main(String[] args) {
        University MAI = new University("Московский Авиационный Институт",
                "Тут какая-то инфа об университете");
        MAI.setStudent(studentNames);
        MAI.showGoodStudents();
        System.out.println("Название университета - " + MAI.getName());
        System.out.println(MAI.getUniversityInfo());
        System.out.printf("Средний балл у учащихся - %.2f", MAI.averageGPA());
    }
}
