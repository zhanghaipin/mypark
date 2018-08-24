package park;

import java.util.Collections;
import java.util.Comparator;

public class SmartBoy extends Boy{
    public String parkCar(Car car){
        return findParkByEmptyNum().parkCar(car);
    }

    private Park findParkByEmptyNum() {
        Collections.sort(parks, new Comparator<Park>() {
            @Override
            public int compare(Park p1, Park p2) {
                return p2.getEmptyCarNum()-p1.getEmptyCarNum();
            }
        });
        return parks.get(0);
    }

}
