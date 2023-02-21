package lesson7.testAnonim;

public class DemoAnonim {
//    Анонимный класс.
//    Есть возможность менять реализацию методов класса.
//    Часть методов нас устаривает, а часть не устраивает
//    Та, которая не устраивает может быть переопределена.
    void g(){
        new Test(){

            @Override
            void f() {
                demo();
                super.f();
                System.out.println("Дополнительная информация.");
            }
        }.f();
    }

    public static void main(String[] args) {
        new DemoAnonim().g();
    }
}
