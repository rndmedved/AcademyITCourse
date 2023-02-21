package lesson9.testLinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list, "Java", "PHP", "JS");
        list.addFirst("Python");
        list.addLast("Node");
        System.out.println(list.get(2));//получение элемента из коллекции linkedList долгая операция
        //из ArrayList быстрее получить. А вставка значений в середину до 11 версии Java было быстрее чем в ArrayList.
        //
    }
}
