package lesson9.dopDZ;

public class TVSet implements Comparable<TVSet> {
    private String title;
    private int diagonal;

    public TVSet(String title, int diagonal) {
        this.title = title;
        this.diagonal = diagonal;
    }

    public String getTitle() {
        return title;
    }

    public int getDiagonal() {
        return diagonal;
    }

    @Override
    public String toString() {
        return "Телевизор{" +
                "Title='" + title + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }


    @Override
    public int compareTo(TVSet tvSet) {
        return title.compareTo(tvSet.getTitle());
    }
}
