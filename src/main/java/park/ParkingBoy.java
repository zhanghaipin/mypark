package park;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingBoy {

    private List<Park> parks;

    public String parkCar(Car car){
        for(int i=0;i<parks.size();i++) {
            if (parks.get(i).isFull()) {continue;}
            return parks.get(i).parkCar(car);
        }
        return null;
    }

    public Car pickCar(String carNum){
        Car car=null;
        for(int i=0;i<parks.size();i++) {
            car= parks.get(i).pickCar(carNum);
            if(car!=null){break;}
        }
        return car;
    }

    //getter and setter
    public void setParks(List<Park> parks) {
        this.parks = parks;
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
