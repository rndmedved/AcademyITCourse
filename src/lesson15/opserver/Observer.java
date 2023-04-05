package lesson15.opserver;

public class Observer {
    private String login;

    public Observer(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    void update(String info){
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "Observer{" +
                "login='" + login + '\'' +
                '}';
    }
}
