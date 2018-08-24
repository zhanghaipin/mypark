package park;

import java.util.List;

public abstract class Boy {
    protected List<Park> parks;

    public abstract String parkCar(Car car);

    public Car pickCar(String carNum){
        Car car=null;
        for(Park park:parks) {
            car= park.pickCar(carNum);
            if(car!=null){break;}
        }
        return car;
    }

    //getter and setter
    public void setParks(List<Park> parks) {
        this.parks = parks;
    }
}
