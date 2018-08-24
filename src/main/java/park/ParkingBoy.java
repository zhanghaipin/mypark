package park;

import java.util.*;

/**
 * park car by parking order
 */
public class ParkingBoy extends Boy{

    @Override
    protected Park findPark() {
        for(Park park:parks) {
            if (park.isFull()) {continue;}
            return park;
        }
        return null;
    }


    ///////////////////////////Park study 08-23 pm////////////////////////////////////
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
