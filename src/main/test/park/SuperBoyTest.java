package park;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SuperBoyTest {
    private Boy boy;

    @Before
    public void initParkingBoy(){
        List<Park> parks=new ArrayList<>();
        parks.add(new Park("parkA",5));
        parks.add(new Park("parkB",10));
        parks.add(new Park("parkC",15));
        boy=new SuperBoy();
        boy.setParks(parks);
    }

    @Test
    public void should_return_parkName_when_input_car4(){
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
