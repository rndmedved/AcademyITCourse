package lesson7.testInterface;

public class Post implements IMessager {
    @Override
    public void sendMessage() {
        System.out.println("Сообщение было отправлено.");
    }

    @Override
    public void getMessage() {
        System.out.println("Сообщение было получено!");
    }
}
