package salary;

public class DirectorSalary extends Salary{
    private int salary;

    public DirectorSalary() {
        salary = BASE_RATE * 10;
    }

    @Override
    public int getSalary() {
        return salary;
    }


}
