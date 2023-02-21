package salary;

public class Main {
    public static void main(String[] args) {
        System.out.println("Директор получает - " + new DirectorSalary().getSalary());
        System.out.println("Экономист получает - "+ new EconomistSalary().getSalary());
        System.out.println("Программист получает - " + new ProgrammerSalary().getSalary());
    }
}
