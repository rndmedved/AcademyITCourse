package tests;

public class LessonTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Пася", 3,12);
        animals[1] = new Dog("Muhtar", 12, 2);
        animals[2] = new Animal("Бездомный животный");
        for (Animal animal:animals){
            System.out.println(animal);
            animal.saySomething();
        }
        animals[0].saySomething();
        Cat murka = new Cat("Murka", 2, 15);
        murka.saySomething();

        Dog kashtanka = new Dog("Kashtanka", 3, 32);
        kashtanka.saySomething();
        System.out.println(kashtanka.hashCode());
    }

    public static int newMethod(){
        return 0;
    }

}
class Animal{
    private String name;
    private int mass;

    /**
     * Метод указывает, что говорит непонятный животный.
     */
    public void saySomething(){
        System.out.println("I am strange animal ((!");
    }

    public Animal(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    public Animal(String name) {
        this.name = name;
        mass = 10;
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}

class Cat extends Animal{
    private int tailLength;
    public Cat(String name, int mass, int tailLength) {
        super(name, mass);
        this.tailLength = tailLength;
    }

    /**
     * Метод указывает, что говорит кот
     */
    @Override
    public void saySomething() {
        System.out.println("I am happy beautiful cat!");
    }

    public Cat(String name) {
        super(name);
    }

    public int getTailLength() {
        return tailLength;
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString()+
                "tailLength=" + tailLength +
                '}';
    }
}

class Dog extends Animal{
    private int teethCount;

    public Dog(String name, int mass, int teethCount) {
        super(name, mass);
        this.teethCount = teethCount;
    }

    /**
     * Метод указывает, что говорит собака.
     */
    @Override
    public void saySomething() {
        System.out.println("I am angry biting dog!");
    }

    public Dog(String name) {
        super(name);
    }

    public int getTeethCount() {
        return teethCount;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "teethCount=" + teethCount +
                '}';
    }
}
