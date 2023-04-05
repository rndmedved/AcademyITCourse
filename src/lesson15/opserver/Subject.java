package lesson15.opserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String titleSubject;
    private List<Item> itemList;
    private List<Observer> observerList = new ArrayList<>();

    public Subject(String titleSubject, List<Item> itemList) {
        this.titleSubject = titleSubject;
        this.itemList = itemList;
    }

    void showItems(){
        for (Item item : itemList) {
            System.out.println("Название: "+ item.getTitle()+ "" +
                    ", описание: " + item.getContent());
        }
    }

    /**
     *     Добавление подписчика
     */
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        if (observerList.remove(observer)){
            System.out.println("Пользователь " + observer.getLogin() + " покинул канал.");
        }
        System.out.println(observerList);
    }

    /**
     * Добавление ролика
     */
    void addItem(Item item){
        itemList.add(item);
        notifyAllObservers(item);

    }

    private void notifyAllObservers(Item i) {
        for (Observer item : observerList) {
            item.update("Уважаемый подписчик, на канале "+
                    titleSubject + " вышел ролик " + i.getTitle());
        }
    }

}
