package lesson8.Office;

import java.util.*;

public class Office {
    static Person getManMaxSalary(List<Person>men){
        int maxSalary = 0;
        Person richMan = null;
        for (Person man : men) {
            if(man.getSalary() > maxSalary){
                richMan = man;
                maxSalary = man.getSalary();
            }
        }
        return richMan;
    }
    public static void main(String[] args) {
        List<Person> men = new ArrayList<>();
        Collections.addAll(men,
                new Person("Иван", 50000),
                new Person("Маша", 60000),
                new Person("Маша", 65600));
        System.out.println("Сотрудник с максимальным окладом - " +
                getManMaxSalary(men).getName());

    }
}
