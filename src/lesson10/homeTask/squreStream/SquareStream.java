package lesson10.homeTask.squreStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SquareStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, -4, 5, 6, 1, 2, 3, 4, 5, 4);
        List result = list.stream().map(x -> x * x).distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
