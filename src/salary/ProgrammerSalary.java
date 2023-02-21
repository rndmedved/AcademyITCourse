package salary;

public class ProgrammerSalary extends Salary{
    private int salary;

    public ProgrammerSalary() {
        this.salary = BASE_RATE * 4;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}

