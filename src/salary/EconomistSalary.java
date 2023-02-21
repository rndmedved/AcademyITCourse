package salary;

public class EconomistSalary extends Salary{
    private int salary;


    public EconomistSalary() {
        salary = BASE_RATE * 2;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
