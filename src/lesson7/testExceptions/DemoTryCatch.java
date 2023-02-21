package lesson7.testExceptions;


public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / (int) (Math.random() * 2);
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println("На нуль делить нельзя");
        }
        System.out.println("Continue");
    }
}
