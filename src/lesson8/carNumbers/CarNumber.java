package lesson8.carNumbers;

import java.util.Objects;

public class CarNumber {
    private String series;
    private String number;
    private String region;
    private Driver driver;

    public CarNumber(String series, String number, String region, Driver driver) {
        this.series = series;
        this.number = number;
        this.region = region;
        this.driver = driver;

    }

    public Driver getDriver() {
        return driver;
    }

    public String getDriverFio() {
        return driver.getFio();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarNumber carNumber = (CarNumber) o;
        return Objects.equals(series, carNumber.series) && Objects.equals(number, carNumber.number) && Objects.equals(region, carNumber.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, number, region);
    }

    @Override
    public String toString() {
        return series.substring(0,1)+
                number+series.substring(1)+
                region;
    }

    public boolean isBeautifulNumber(){
        char[] c1 = number.toCharArray();
        char[] c2 = series.toCharArray();
        return c1[0] == c1[2] || c2[0] == c2[1] && c2[1] == c2[2];
    }
}
