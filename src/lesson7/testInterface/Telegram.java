package lesson7.testInterface;

public class Telegram implements IMessager{
    private String title;

    public Telegram(String title) {
        this.title = title;
    }

    @Override
    public void sendMessage() {
        System.out.println("Отправлено сообщение через " + title);
    }

    @Override
    public void getMessage() {

    }
}
