package lesson9.dopDZ;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
/**
*показать возможность использования TreeSet с объектами
*/
public class Main {
    public static void main(String[] args) {
        TVSet m1 = new TVSet("Samsung", 18);
        TVSet m2 = new TVSet("LG", 21);
        TVSet m3 = new TVSet("ChinaProduction", 29);
        TVSet m4 = new TVSet("Acer", 18);
        Set<TVSet> set = new TreeSet<>();//Объекты не храним в трисет. Только примитивы.
        Collections.addAll(set, m1, m2, m3, m4);
        for (TVSet tvSet : set) {
            System.out.println(tvSet);
        }
    }
}



