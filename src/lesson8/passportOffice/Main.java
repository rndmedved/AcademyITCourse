package lesson8.passportOffice;

import lesson8.Office.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private List<Passport> passportList;
    private String series;
    public static void main(String[] args) throws IOException {
        System.out.println("Сколько паспортов необходимо создать.");
        Main obj = new Main(Integer.parseInt(reader.readLine()));
        System.out.println("Введите серию и номер паспорта через пробел");
        String[] info = reader.readLine().split(" ");
        System.out.println(obj.findPerson(info[0], info[1]));
        Random r = new Random();

    }

    /**
     *
     * @param count - Количество паспортов, которые нужно создавать.
     */
    Main(int count) throws IOException {
        passportList = new ArrayList<>();
        String fio = "";
        createSeries();
        Passport newPassport = null;
        while (count > 0){
            String numberPassport = generateNumber(6);
            if(isDublicatePassport(numberPassport)){
                System.out.println("Дубликат");
                continue;
            } else {
                System.out.printf("Введите имя владельца для паспорта %s %s\n", series, numberPassport);
                fio = reader.readLine();
                newPassport = new Passport(fio, series, numberPassport);
                passportList.add(newPassport);
            }
            count--;
        }
    }
    public String findPerson(String series, String number){
        for (Passport passport : passportList) {
            if(passport.getSeries().equalsIgnoreCase(series) && passport.getNumber().equalsIgnoreCase(number))
                return passport.getFio();
        }
        return "Такого человека нет";
    }
    private boolean isDublicatePassport(String number){
        for (Passport passport : passportList) {
            if (passport.getNumber().equalsIgnoreCase(number) && passport.getSeries().equalsIgnoreCase(series))
                return true;
        }
        return false;
    }
    private static boolean isSeries(String series){
        String[] chars= series.split("-");
        if(chars.length == 2){
            for (String item : chars) {
                if(item.length() == 2){
                    char[] masChar = item.toCharArray();
                    for (char c : masChar) {
                        if(!Character.isDigit(c)){
                            return false;
                        }
                    }
                } else return false;
            }
        } else return false;
        return true;
    }

    /**
     * Метод для заполнения числа цифрами в количестве count штук
     * @param count
     * @return
     */
    static private String generateNumber(int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(new Random().nextInt(10));
        }
        return builder.toString();
    }


    private void createSeries() throws IOException {
        System.out.println("Введите \"a\", если серию нужно заполнить автоматически, либо \"h\", если вручную ");
        String answer = reader.readLine();
        if(answer.equalsIgnoreCase("h")){
            System.out.println("Введите серю паспорта в формате NN-NN");
            String series = reader.readLine();//Нужно проверить серию
            if(isSeries(series)){
                this.series = series;
            }
        }else{
            series = generateNumber(4);
        }
        System.out.println("Серия паспорта " + series);
    }
}
