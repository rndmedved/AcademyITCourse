package lesson9.planeParking;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class PlaneParking {
    private static PlaneParking planeParking;
    private Deque<Plane> planes;

    private PlaneParking(){
        planes = new LinkedBlockingDeque<>(5);
    }
    public static PlaneParking getPlaneParking(){
        if(planeParking == null){
            planeParking = new PlaneParking();
        }
        return planeParking;
    }

    public Deque<Plane> getPlanes() {
        return planes;
    }
}
