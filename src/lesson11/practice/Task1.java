package lesson11.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        String cities = "Moscow, Нижний Новгород, Omsk";
        String[] arr = cities.split(", ");
        System.out.println(Arrays.toString(arr));
        List<Integer> listSize = Arrays.asList(arr)
                .stream()
                .map(item -> item.length())
                .sorted()
                .collect(Collectors.toList());
        List<String> listCities = Arrays.asList(arr)
                        .stream()
                                .sorted(new Comparator<String>() {
                                    @Override
                                    public int compare(String s, String t1) {
                                        return s.length() - t1.length();
                                    }
                                }).collect(Collectors.toList());

        listCities.forEach(System.out::println);


    }
}
