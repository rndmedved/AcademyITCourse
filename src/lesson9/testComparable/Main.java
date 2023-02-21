package lesson9.testComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        Collections.addAll(list, "bbb", "aaa", "ccc");
        Collections.sort(list);
        System.out.println(list);
    }
}
