package lesson6.test;

public class Main {
    static {
        System.out.println("Вызывается первый!");
    }
    public static void main(String[] args){
        System.out.println("Вызывается вторым. ))");
        new Main().method3();
        System.out.println("Main закончил свою работу.");
    }

    void method3(){
        System.out.println("Метод 3 открылся");
        method2();
        System.out.println("Метод 3 закрылся");
    }
    void method2(){
        System.out.println("Метод 2 открылся");
        method1();
        System.out.println("Метод 2 закрылся");

    }
    void method1(){
        System.out.println("Метод 1 открылся");
        System.out.println("Он не вызывает ничего, потому и сразу закрылся.");
    }
}
