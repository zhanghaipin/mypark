package park;

import java.util.HashMap;
import java.util.Map;

public class Park {
    private String parkName;
    private int maxCarNum;
    private boolean full;
    private Map<String,Car> carMap;

    public Park(String parkName, int maxCarNum) {
        this.parkName = parkName;
        this.maxCarNum = maxCarNum;
        this.full = false;
        carMap=new HashMap<>();
    }

    public String parkCar(Car car){
        if(full){return null;}
        carMap.put(car.getNumber(),car);
        judgeFull();
        return parkName;
    }

    public Car pickCar(String carNum){
        if(!carMap.containsKey(carNum)) {return null;}
        Car car = carMap.get(carNum);
        carMap.remove(carNum);
        judgeFull();
        return car;
    }

    private void judgeFull() {
        if(carMap.size()==maxCarNum){
            full=true;
        }else{
            full=false;
        }
    }

    //getter and setter
    public boolean isFull() {
        return full;
    }
}
