package park;

import java.util.*;

public class ParkingBoy extends Boy{

    public String parkCar(Car car){
        for(int i=0;i<parks.size();i++) {
            if (parks.get(i).isFull()) {continue;}
            return parks.get(i).parkCar(car);
        }
        return null;
    }
    ///////////////////////////////////////////////////////////////
    private static Map<String,Car> carMap=new HashMap<>();
    private static final int MAX_CAR_NUM=100;

    public static boolean park(Car car) {
        if (carMap.size()==MAX_CAR_NUM){return false;}
        carMap.put(car.getNumber(),car);
        return true;
    }

    public static Car pick(String carNum) {
        if(!carMap.containsKey(carNum)) {return null;}
        Car car = carMap.get(carNum);
        carMap.remove(carNum);
        return car;
    }
}
