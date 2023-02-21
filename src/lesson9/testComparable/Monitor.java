package lesson9.testComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monitor implements Comparable<Monitor>{
    public static void main(String[] args) {
        /*Comparator<Monitor> comparator = new Comparator<Monitor>() {
            @Override
            public int compare(Monitor monitor, Monitor t1) {
                return monitor.diagonal - t1.diagonal;
            }
        };*/
        Monitor m1 = new Monitor("Sumsung" , 17);
        Monitor m2 = new Monitor("LG", 23);
        Monitor m3 = new Monitor("ChinaProdaction", 28);

        List<Monitor> monitorList = new ArrayList<>();
        Collections.addAll(monitorList, m1, m3, m2);
        Collections.sort(monitorList);
        System.out.println(monitorList);
    }
    private String Title;
    private int diagonal;

    public Monitor(String title, int diagonal) {
        Title = title;
        this.diagonal = diagonal;
    }



    @Override
    public String toString() {
        return "Monitor{" +
                "Title='" + Title + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }

    /**
     * поле, по которому будем выполнять сортировку указываем в этом методе.
     * Данный метод сравнивает последовательно 2 объекта
     * 1) this
     * 2) в параметре
     * Метод вернет целое число и на основе знака числа выполняется рассчет навправления сортировки.
     * @param monitor
     * @return
     */
    @Override
    public int compareTo(Monitor monitor) {
        return this.diagonal  - monitor.diagonal;
    }
}
