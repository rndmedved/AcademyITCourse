package lesson8.testList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        Collections.addAll(list, "Python", "C#");
        int i = 1;
        for (String s : list) {
            System.out.println(i + ")" +" Язык программирования " +s);
            i++;
        }
        list.add(2, "PHP");
        for(int j = 0; j < list.size(); j++){
            System.out.println((j +1) + ")" +" Язык программирования " + list.get(j));
        }
        String removed;
        removed = list.remove(3);
        System.out.println(list);
        System.out.println(removed);
        list.remove("PHP");
        System.out.println(list);
    }
}
