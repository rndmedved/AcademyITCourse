package lesson5;



public class Company {
    String titleCompany;
    String address;
    Person men[];
    Position[] positions = {
            new Position(1, "Engineer"),
            new Position(2, "DevOps"),
            new Position(3, "TeamLeader")
    };

    public Company(String titleCompany, String address, Person[] men) {
        this.titleCompany = titleCompany;
        this.address = address;
        this.men = men;
        setPositions();
    }

    /**
     * Метод вернет сотрудника с максимальным окладом
     * @return
     */
    Person getPersonWithMaxSalary(){

//        Пусть первый сотрудник имеет максимальный оклад
        Person personMaxSalary = men[0];
        for (int i = 1; i < men.length; i++) {
            if(personMaxSalary.salary < men[i].salary){
                //если у любого следующего сотрудника оклад окажется больше, то переопределяем
                personMaxSalary = men[i];
            }
        }
        return personMaxSalary;
    }

    public void showPersons(){
        System.out.println("В компании " + titleCompany + " работают следующие сотрудники:");
        int i = 1;
        for (Person person : men) {
            System.out.printf("%d) %s\n",i,person.getInfo());
            i++;
        }
        System.out.println("Средняя оплата сотрудников - " +getMiddleSalary());
    }
    double getMiddleSalary(){
        double result = 0;
        int i =0;
        for (Person man : men) {
           result += man.salary;
           i++;
        }
        return result / i;
    }
    void useMotivation(){
//        Motivation motivation = new Motivation();
        final int SIZE_BONUS = 20;
        double middleSalary = getMiddleSalary();
        for (Person man : men) {
            if(man.salary < middleSalary){
                Motivation.changeSalary(man, SIZE_BONUS);
            }
        }
        Motivation.changeSalary(getPersonWithMaxSalary(), -SIZE_BONUS);

    }
    private void setPositions(){
        for (Person man : men) {
            man.position = positions[(int)Math.round(Math.random() * 3)];
        }
    }
}
