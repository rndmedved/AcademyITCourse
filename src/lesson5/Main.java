package lesson5;

public class Main {
//    CTRL + B - это быстрый переход к объявлению метода
    public static void main(String[] args) {
        Person man1 = new Person("Иванов",27,60000);
        Person man2 = new Person("Петров",26,80000);
        Person man3 = new Person("Сидоров",29,70000);
//        System.out.println("Привет, " + man1.fio);
//        man1.fio = "Иванов";
//        man1.age = 35;
//        man1.salary = 70000;

//        Конструктор - это метод, который вызывается автоматически при создании
//        объекта через оператор new. Цель конструктора - заполнить свойства объекта значениями
//          Конструктор не имеет типа возвращаемого значения! Потому что конструктор всегда
//          возвращает объект класса
//        System.out.println(man1.getInfo());


        Person persons[] = {man1,man2,man3};
//        for (Person person : office) {
//            System.out.println(person.getInfo());
//        }

        Company company = new Company("IT Start","Московая 10",persons);
        company.showPersons();
        Person personMaxSalary = company.getPersonWithMaxSalary();
        System.out.println("Сотрудник " + personMaxSalary.fio + " имеет максимальный оклад: " + personMaxSalary.salary);
        company.useMotivation();
        company.showPersons();
//        System.out.println(company.getPersonWithMaxSalary().fio + " имеет макс. оклад");

    }
}
