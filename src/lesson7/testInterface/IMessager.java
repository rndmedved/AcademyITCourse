package lesson7.testInterface;

public interface IMessager {
    void sendMessage();
    void getMessage();

    default void showInfoAboutMessager(String info){
        System.out.println(info);
    }
}
