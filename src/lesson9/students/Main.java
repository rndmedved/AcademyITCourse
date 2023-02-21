package lesson9.students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static List studentsList = new ArrayList<Student>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        createStudentsList();
        while (true) {
            System.out.println("Для вывода информации о студентах введите \"LIST\"; Для сортировки коллекции - \"SORT\"; Для завершения программы - \"EXIT\"");
            String command = reader.readLine().toLowerCase();
            switch (command){
                case "list": showStudentList();
                break;
                case "sort": sortStudentList();
                break;
                case "exit": return;
            }
        }
    }

    private static void showStudentList() {
        for (Object o : studentsList) {
            System.out.println(o);
        }
    }

    private static void sortStudentList() throws IOException {
        System.out.println("По какому полю требуется сортировка? \"FIO\" - по фамилии, имени и отчеству. \"GRADE\" - по среднему баллу.");
        String sorting = reader.readLine();
        if(sorting.equalsIgnoreCase("fio")) {
            System.out.println("Сортировка по имени.");
            Collections.sort(studentsList,new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        } else if(sorting.equalsIgnoreCase("grade")){
            System.out.println("Сортировка по среднему баллу.");
            Collections.sort(studentsList, new Comparator<Student>(){

                @Override
                public int compare(Student o1, Student o2) {
                    return (int) Math.round(o1.getGPA() * 1000 - o2.getGPA() * 1000);
                }
            });
        } else{
            System.out.println("Сортировки не произошло.");
        }
    }

    private static void createStudentsList() throws IOException {
        boolean repeat = true;
        int iterator = 0;
        while(repeat) {
            studentsList.add(getStudent(iterator));
            System.out.println("Если желаете добавить еще 1 студента, наберите \"Y\".");
            if(!reader.readLine().equalsIgnoreCase("y")) repeat = false;
            iterator++;
        }
    }

    private static Student getStudent(int id) throws IOException {
        System.out.println("Добавьте студнета в базу данных. \n" +
                "Введите его фамилию, имя и отчество: ");
        String fio = reader.readLine();
        return new Student(id, fio);
    }
}
