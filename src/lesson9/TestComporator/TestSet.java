package lesson9.TestComporator;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        TVSet m1 = new TVSet("Samsung", 17);
        TVSet m2 = new TVSet("LG", 23);
        TVSet m3 = new TVSet("ChinaProduction", 28);
        TVSet m4 = new TVSet("Acer", 17);
        Set<TVSet> set = new TreeSet<>();//Объекты не храним в трисет. Только примитивы.
        Collections.addAll(set, m1, m2, m3, m4);
        for (TVSet tvSet : set) {
            System.out.println(tvSet);
        }
    }
}



