package lesson15.opserver;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var itemFirst = new Item("Java for beginning", "content");
        var itemSecond = new Item("java for seniers", "content hard");
        var items= new ArrayList<Item>();
        Collections.addAll(items,itemFirst, itemSecond);
        var youtubeChannel = new Subject("programmers", items);
        var obs1 = new Observer("Vasya");
        var obs2 = new Observer("Senya");
        youtubeChannel.addObserver(obs2);
        youtubeChannel.addObserver(obs1);

        youtubeChannel.addItem(new Item("Kafka", "not an programmist theme"));
    }
}
