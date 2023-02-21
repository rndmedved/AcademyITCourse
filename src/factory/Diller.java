package factory;

public class Diller {
    private String titleDiller;
    private int ageDiller;

    public Diller(String titleDiller, int ageDiller) {
        this.titleDiller = titleDiller;
        if (ageDiller < 0) {this.ageDiller = 0;
        }else this.ageDiller = ageDiller;
    }

    void makeOrder(Factory factory, int count, String[] models) {
        Order order = new Order(factory, count, models, this);
        order.showInfoOrder();
    }

    public String getTitleDiller() {
        return titleDiller;
    }

    public int getAgeDiller() {
        return ageDiller;
    }
}
