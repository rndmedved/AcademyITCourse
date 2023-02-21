package lesson9.planeParking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final String MENU = "ADD - добавление нового самолета.\n" +
            "Для посадки самолета, введите его бортовой номер.\n" +
            "exitAll - выгнать все самолеты со стоянки.\n" +
            "exitLast - отправить в рейс самолет, который выезжает со стоянки.\n" +
            "man - повторный вызов меню.\n" +
            "\":wq\" - завершить программу.";
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Set<Plane> planesInAir = new HashSet<>();
    private static PlaneParking planeParking = PlaneParking.getPlaneParking();
    public static void main(String[] args) {   
        
        System.out.println(MENU);
        try{
            while (true) {
                System.out.println("Введите команду: ");
                String command = reader.readLine();
                switch (command){
                    case "ADD": addNewPlane();
                    break;
                    case "exitAll": moveAllPlanes();
                    break;
                    case "exitLast": movePlane();
                    break;
                    case "man":
                        System.out.println(MENU);
                        break;
                    case ":wq": return;
                    default: landPlane(command);

                }
            }
        }catch (IOException e){}
    }

    private static void landPlane(String number) {

        for (Plane plane : planesInAir) {
            if (plane.getNumber() == Integer.parseInt(number)){
                if(planeParking.getPlanes().offerLast(plane)) {
                    System.out.println(plane + " приземлился.");
                    planesInAir.remove(plane);
                } else {
                    System.out.println("Парковка переполнена! " + plane + " остался в воздухе.");
                }
                return;
            }
        }
        System.out.println("Unknown instruction - "+ number);
    }

    private static void movePlane() {
        if(planeParking.getPlanes().size() != 0) {
            Plane plane = planeParking.getPlanes().pollLast();
            System.out.println(plane + " покинул стоянку.");
        } else {
            System.out.println("Парковка пуста.");
        }
    }

    private static void moveAllPlanes() {
        while (planeParking.getPlanes().size() != 0) {
            Plane plane = planeParking.getPlanes().pollLast();
            System.out.println(plane + " покинул стоянку.");
        }
        System.out.println("Парковка пуста.");
    }

    private static void addNewPlane() {        
        try {
            System.out.println("Введите название самолета.");
            String name = reader.readLine();
            System.out.println("Введите номер самолета.");
            int number = Integer.parseInt(reader.readLine());
            planesInAir.add(new Plane(name, number));
            System.out.println("Над аэропортом кружат самолеты в количестве: " + planesInAir.size() + " штук\\штуков\\штука.");
        }catch (IOException e){}
    }
}
