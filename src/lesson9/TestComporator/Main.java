package lesson9.TestComporator;

import lesson9.testComparable.Monitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TVSet m1 = new TVSet("Sumsung" , 17);
        TVSet m2 = new TVSet("LG", 23);
        TVSet m3 = new TVSet("ChinaProdaction", 28);
        TVSet m4 = new TVSet("Acer", 17);
        List<TVSet> list = new ArrayList<>();
        Collections.addAll(list, m1, m2, m3, m4);
//        list.sort(new MyComporator());
        /*Comparator<TVSet> compDiagonal = new Comparator<TVSet>() {
            @Override
            public int compare(TVSet tvSet, TVSet t1) {
                return tvSet.getDiagonal() - t1.getDiagonal();
            }
        } ;
        list.sort(compDiagonal);*/
        Comparator<TVSet> compTitle = new Comparator<TVSet>() {
            @Override
            public int compare(TVSet tvSet, TVSet t1) {
                return tvSet.getTitle().compareTo(t1.getTitle());
            }
        } ;
        list.sort(compTitle);


        System.out.println(list);
    }
}
