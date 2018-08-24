package park;

import java.util.HashMap;
import java.util.Map;

public class Park {
    private String parkName;
    private int maxCarNum;
    private int emptyCarNum;
    private double emptyRate;
    private boolean full;
    private Map<String,Car> carMap;

    private Park(){}
    public Park(String parkName, int maxCarNum) {
        this.parkName = parkName;
        this.maxCarNum = maxCarNum;
        this.emptyRate=100.0;
        this.emptyCarNum=maxCarNum;
        this.full = false;
        carMap=new HashMap<>();
    }

    public String parkCar(Car car){
        if(full||carMap.containsKey(car.getNumber())){return null;}
        carMap.put(car.getNumber(),car);
        updateField();
        return parkName;
    }

    public Car pickCar(String carNum){
        Car car = carMap.get(carNum);
        if(car!=null) {
            carMap.remove(carNum);
            updateField();
        }
        return car;
    }

    private void  updateField(){
        this.full=(carMap.size()==maxCarNum)?true:false;
        this.emptyCarNum=maxCarNum-carMap.size();
        this.emptyRate=100*((double)emptyCarNum/maxCarNum);
    }

    //getter and setter
    public boolean isFull() {
        return full;
    }
    public int getEmptyCarNum() {
        return emptyCarNum;
    }
    public double getEmptyRate() {
        return emptyRate;
    }
}
