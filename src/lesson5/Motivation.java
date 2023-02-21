package lesson5;

import lesson5.Person;

public class Motivation {
    public static void  changeSalary(Person person, int rate){
        if (rate > 0){
            System.out.println("Сотрудник " +  person.fio + " получает премию в размере " + rate + " %");
        } else {
            System.out.println("Сотрудник " +  person.fio + " получает взыскание в размере " + rate + " %");
        }
        person.salary += person.salary * rate /100;
    }
}
