package lesson7.innerClass;

public class Main {
    public static void main(String[] args) {
//        PC pc = new PC("MyComputer", "DDR",
//                "Duron", 100, 80);
//        pc.on();
//        pc.off();
//        new PC().new RAM("DDR-2", 6).on();
        PC pc = new PC();
        PC.RAM ram = pc.new RAM("smth", 10);
        ram.on();
        ram.off();
    }
}
