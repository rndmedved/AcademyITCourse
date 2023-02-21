package lesson7.testInterface;

public class Main {
    public static void main(String[] args) {
        Viber viber = new Viber("Вайбер");
        viber.auth();
        viber.sendMessage();
        viber.ownMethod();
        viber.showInfoAboutMessager(viber.getTitle());
        IMessager telegram = new Telegram("Телеграмм");
        telegram.sendMessage();
        IMessager mas[] = {viber, telegram};
        for (IMessager ma : mas) {
            ma.sendMessage();
        }
    }
}
