package lesson9.TestComporator;

import java.util.Comparator;

public class MyComporator implements Comparator<TVSet> {
    @Override
    public int compare(TVSet tvSet, TVSet t1) {
        return tvSet.getDiagonal() - t1.getDiagonal();
    }
}
