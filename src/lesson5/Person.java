package lesson5;

public class Person {
    String fio;
    int salary;
    int age;
    Position position;

//    Person(String fio,int age,int salary){
////        this - это ссылка на объект для которого вызван конструктор
//        this.fio = fio;
//        this.age = age;
//        this.salary = salary;
//    }

//    Для динамического создания конструктора нажимайте сочетание клавиш ALT+INSERT


    public Person(String fio, int age, int salary) {
//        this - это ссылка на объект, который запускает наш конструктор
        this.fio = fio;
        this.salary = salary;
        this.age = age;

    }


    String getInfo(){
        return "Сотруднику " + fio + " " + age + " лет, его оклад: " + salary
                + " его должность  - " + position.titlePosition;
    }
}
