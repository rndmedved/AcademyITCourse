package lesson8.notary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Notarius {
    public static void main(String[] args) throws IOException {
        List<String> men = new ArrayList<>();
        int countClients = 0;
        String fio;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            if (countClients > 10){
                System.out.println("Нотариус завершает свою работу");
                break;
            }

            System.out.printf("Клиент №%d, введите ваше имя.\n", ++countClients);
            fio = reader.readLine();
            men.add(fio);
            if(men.size() > 5){
                System.out.printf("Может войти %s клиент. Готовится %s.\n ", men.remove(0), men.get(0));
            }
        }
    }
}
