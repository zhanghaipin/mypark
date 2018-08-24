package park;

import java.util.List;

public abstract class Boy {
    protected List<Park> parks;

    public abstract String parkCar(Car car);

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
}
