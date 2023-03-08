package lesson14.singleton;

public class Catalog {
    void getGoods(){
        var db = SingleConnection.getObj();
        db.select();
    }
}
