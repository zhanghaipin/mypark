package park;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * exercise test
 */
public class ParkingBoyTest {

    private ParkingBoy boy;

    @Before
    public void initParkingBoy(){
        List<Park> parks=new ArrayList<>();
        parks.add(new Park("parkA",5));
        parks.add(new Park("parkB",10));
        parks.add(new Park("parkC",15));
        boy=new ParkingBoy();
        boy.setParks(parks);
    }

    @Test
    public void should_return_parkName_when_input_car(){
        //given
        Car car=new Car("粤C GE4321");
        //when
        String parkName=boy.parkCar(car);
        //then
        Assert.assertNotNull(parkName);
    }
    @Test
    public void should_return_car_when_input_carNum(){
        boy.parkCar(new Car("粤C ABC123"));
        //given
        String carNum="粤C ABC123";
        //when
        Car car= boy.pickCar(carNum);
        //then
        Assert.assertNotNull(car);
    }

    @Test
    public void should_return_parkName_when_input_car2(){
        for(int i=0;i<20;i++) {
            //given
            Car car = new Car("粤C GE43"+i);
            //when
            String parkName = boy.parkCar(car);
            //then
            System.out.println(parkName);
            Assert.assertNotNull(parkName);
        }
    }
}
