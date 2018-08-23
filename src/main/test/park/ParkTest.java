package park;

import org.junit.Assert;
import org.junit.Test;

public class ParkTest {
    @Test
    public void should_return_message_when_input_car(){
        //given
        Car car=new Car("粤C GE4321");
        //when
        boolean parkStatus= ParkingBoy.park(car);
        //then
        Assert.assertTrue(parkStatus);
    }
    @Test
    public void should_return_car_when_input_car_num(){
        ParkingBoy.park(new Car("粤C GE4321"));
        //given
        String carNum="粤C GE4321";
        //when
        Car car= ParkingBoy.pick(carNum);
        //then
        Assert.assertEquals(carNum,car.getNumber());
    }
}
