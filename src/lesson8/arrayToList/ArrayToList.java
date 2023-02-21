package lesson8.arrayToList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] cities = {"Москва", "Питер", "Красноярск"};
        List<String> list = new ArrayList<>();
        Collections.addAll(list, cities);
        List<String> newList = new ArrayList<>();
        newList.add("Волгоград");
        List<Integer> sdf = new ArrayList<>();
        int[] i = {1, 3,2,4 };
//        sdf.addAll(i);
    }
}
