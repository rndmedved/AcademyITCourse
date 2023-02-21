package lesson10.homeTask.refactoringCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RefactoringCode {
   /* Переделать код с использованием Stream API
    int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
    int count = 0;
for (int x : arr) {
        if (x >= 90) continue;
        x += 10;
        count++;
        if (count > 3) break;
        System.out.print(x);*/

    public static void main(String[] args) {
        Integer[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        Arrays.stream(arr).filter(x-> x < 90).limit(3).map(x->  x + 10).forEach(System.out::print);
     /*  List<Integer> listInt = new ArrayList<>();
        Collections.addAll(listInt, arr);
        listInt.stream().filter(x -> x < 90).limit(3).map(x->  x+10).forEach(System.out::print);*/
    }
}
