package lesson8.carNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            /**
             * Для генерации номера региона я внес территории РФ в enum Их можно внести в конструктор офиса ГИБДД по названию региона
             */
            OfficeGIBDD krasnoyarskGIBDD = new OfficeGIBDD(Region.KRASNOYARSK_TERRITORY);
//            OfficeGIBDD moskowGIBDD = new OfficeGIBDD(Region.MOSCOW);
            System.out.println("Введите количество посетителей ГИБДД");

            int count = Integer.parseInt(reader.readLine());
            while (count > 0) {
                System.out.println("Введите ФИО автовладельца");
                krasnoyarskGIBDD.setCarNumber(new Driver(reader.readLine()));//можно вводить большее число данных на автовладельца.
                --count;
            }
            for (CarNumber number : krasnoyarskGIBDD.getCarNumberList()) {
                if(number.isBeautifulNumber()){
                    System.out.println("Поздравляю: \""+ number.getDriverFio()+ ", Вы получили удивительно красивый номер - " + number);
                }else {
                    System.out.println("Автовладелец - " + number.getDriverFio() +
                            " получил номер: " + number);
                }
            }
            System.out.println("Введите номер автомобиля для поиска водителя в формате \"Х000ХХ000\" или \"Х000ХХ00\".");
            System.out.println(krasnoyarskGIBDD.getDriverByCarNumber(reader.readLine()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
