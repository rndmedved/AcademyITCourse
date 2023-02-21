package lesson8.carNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OfficeGIBDD {
    private final static String ALLOWED_SYMBOLS = "АВЕКМНОРСТУХ";
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    private Region regionTitle;
    private String regionNumber;

    private List<CarNumber> carNumberList;

    public OfficeGIBDD(Region regionName) {
        this.regionTitle = regionName;
        regionNumber = regionName.getRegionNumbers()[new Random().nextInt(regionName.getRegionNumbers().length)];
        carNumberList = new ArrayList<>();
        System.out.println("Отделение ГИБДД в регионе: " + regionName.getRegionTitle() + " открылся. \n"+
                "Офис будет выдовать номера с номером региона: "+regionNumber);
    }

    public String getRegionTitle() {
        return regionTitle.getRegionTitle();
    }

    public String getRegionNumber() {
        return regionNumber;
    }

    public List<CarNumber> getCarNumberList() {
        return carNumberList;
    }

    /**
     * Генерирует серию и номер автомобиля
     * Есть возможность генерации серии вручную
     * @param driver
     * @throws IOException
     */
    public void setCarNumber(Driver driver) throws IOException {
        if(driver.isDriver()){
            String series = createSeries();
            String number = createNumber();
            CarNumber tmp = new CarNumber(series, number, regionNumber, driver);
            if(!isDuplicateNumber(tmp)){
                carNumberList.add(tmp);
            } else {
                System.out.println("Такой номер уже есть в базе. Попробуйте создать другой.");
                setCarNumber(driver);
            }
        }else {
            System.out.println("Гражданин слишком молод. Он не может управлять авто.");
        }
    }

    private static String createNumber() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append(new Random().nextInt(10));
        }
        return builder.toString();
    }

    private static String createSeries() throws IOException {
        System.out.println("Введите \"a\", если серию необходимо заполнить" +
                " автоматически, либо \"h\", если заполняем вручную");
        if(reader.readLine().equalsIgnoreCase("h")){
            System.out.println("Введите серию номера автомобиля в формате XXX");
            String series = reader.readLine();
            if(isSeries(series)){
                return series;
            }else{
                System.out.println("Серия введена некорректно. Попробуйте еще раз.");
                createSeries();
            }
        } else return generateSeries();
        return null;
    }

    private static String generateSeries() {
        StringBuilder builder = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int index = r.nextInt(ALLOWED_SYMBOLS.length());
            builder.append(ALLOWED_SYMBOLS.substring(index, index+1));
        }
        return builder.toString();
    }

    private static boolean isSeries(String series) {
        char[] example = ALLOWED_SYMBOLS.toCharArray();
        char charSeries[] = series.toCharArray();
        if (charSeries.length == 3) {
            for (char charS : charSeries) {
                boolean isSeriesContainsExample = false;
                for (char item : example) {
                    if (charS == item) {
                        isSeriesContainsExample = true;
                    }
                }
                if (!isSeriesContainsExample) return false;
            }
        } else return false;
        return true;
    }

    /**
     * Метод ищет Автовладельца по номру автомобиля
     * Номер набирается в формате, привычном для русских авто: X000XX000 или X000XX00
     * @param number
     * @return
     */
    public Driver getDriverByCarNumber(String number){
        for (CarNumber carNumber : carNumberList) {
            if(carNumber.toString().equals(number)) return carNumber.getDriver();
        }
        System.out.println("Номер Автомобиля в базе не зарегистрирован.");
        return null;
    }
    private boolean isDuplicateNumber(CarNumber carNumber){
        for (CarNumber number : carNumberList) {
            if (number.equals(carNumber)) return true;
        }
        return false;
    }


}
