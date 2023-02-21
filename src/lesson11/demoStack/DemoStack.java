package lesson11.demoStack;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Элемент 1");    //добавляем элементы в конец списка.
        stack.push("Элемент 2");
        stack.push("Элемент 3");
        stack.forEach(System.out::println);
        System.out.println("Вершина стека" + stack.peek());
        System.out.println("Элемент " + stack.pop() + " удален.");
        stack.forEach(System.out::println);

    }
}
