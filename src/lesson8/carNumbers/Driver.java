package lesson8.carNumbers;
//Я не хотел делать ничего лишнего. Случайно на работе занесло.
//Решил добавить не просто ФИО воидителя, а сделать класс для него.
//В задании я этот класс постарался использовать по минимуму.
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Driver {
    private String fio;
    private Calendar birthDate;
    private Gender gender;
    private int drivingExperience;

    private boolean isDriver = true;

    /**
     * Устанавливает дату рождения, пол и опыт вождения случайным образом.
     * @param fio
     */
    public Driver(String fio) {
        Random r = new Random();
        int birthYear = r.nextInt(75) + 1930;
        this.fio = fio;
        birthDate = new GregorianCalendar(birthYear, r.nextInt(12), r.nextInt(31));
        gender = r.nextBoolean()? Gender.MALE : Gender.FEMALE;
        drivingExperience = generateDrivingExperience(birthYear);

    }

    /**
     * Водительский стаж и дату рождения устонавливает случайно
     * @param fio
     * @param gender
     */
    public Driver(String fio, Gender gender) {
        this.fio = fio;
        this.gender = gender;
        Random r = new Random();
        int birthYear = r.nextInt(75) + 1930;
        birthDate = new GregorianCalendar(birthYear, r.nextInt(12), r.nextInt(31));
        drivingExperience = generateDrivingExperience(birthYear);
    }

    /**
     * Водительский стаж устанавливает случайно
     * @param fio
     * @param birthDate
     * @param gender
     */
    public Driver(String fio, Calendar birthDate, Gender gender) {
        Random r = new Random();
        this.fio = fio;
        isDriver =  new GregorianCalendar().get(Calendar.YEAR) - birthDate.get(Calendar.YEAR) >= 18;
        this.birthDate = birthDate;
        if(isDriver) {
            drivingExperience = generateDrivingExperience(birthDate.get(Calendar.YEAR));
        }


        this.gender = gender;

    }
    private static int generateDrivingExperience(int birthYear){
        Random r = new Random();
        int maxExp = new GregorianCalendar().get(Calendar.YEAR) - birthYear - 18;
        return maxExp - r.nextInt(maxExp);
    }

    public Driver(String fio, Calendar birthDate, Gender gender, int drivingExperience) {
        isDriver =  new GregorianCalendar().get(Calendar.YEAR) - birthDate.get(Calendar.YEAR) >= 18;
        this.fio = fio;
        this.birthDate = birthDate;
        this.gender = gender;
        if (isDriver) {
            this.drivingExperience = drivingExperience;
        }
    }

    public boolean isDriver() {
        return isDriver;
    }

    public String getFio() {
        return fio;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        if (isDriver) {
            return "Водитель {" +
                    "ФИО - '" + fio + '\'' +
                    ", год рождения - " + birthDate.get(Calendar.YEAR) +
                    ", пол - " + (gender == Gender.MALE ? "мужской" : "женский") +
                    ", опыт вождения - " + drivingExperience +
                    '}';
        } else return "Гражданин {" +
                "ФИО - '" + fio + '\'' +
                ", год рождения - " + birthDate.get(Calendar.YEAR) +
                ", пол - " + (gender == Gender.MALE ? "мужской" : "женский") +
                ", пока ещё пешеход. Опыта вождения не имеет. Управлять автомобилем не может! "+ "}";
    }
}
