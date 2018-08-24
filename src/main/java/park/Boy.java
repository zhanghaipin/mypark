package park;

import java.util.List;

public abstract class Boy {
    protected List<Park> parks;

    protected String parkCar(Car car){
        Park park=findPark();
        return (park==null) ? null : (park.parkCar(car));
    }

    protected abstract Park findPark();

    public Car pickCar(String carNum){
        Car car=null;
        for(Park park:parks) {
            car= park.pickCar(carNum);
            if(car!=null){break;}
        }
        return car;
    }

    //getter and setter
    protected void setParks(List<Park> parks) {
        this.parks = parks;
    }
}
