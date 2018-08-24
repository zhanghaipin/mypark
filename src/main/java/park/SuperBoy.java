package park;

import java.util.Collections;
import java.util.Comparator;

public class SuperBoy extends Boy{

    public String parkCar(Car car){
        return findParkByEmptyRate().parkCar(car);
    }

    private Park findParkByEmptyRate() {
        Collections.sort(parks, new Comparator<Park>() {
            @Override
            public int compare(Park p1, Park p2) {
                return (p2.getEmptyRate()-p1.getEmptyRate()>=0?1:-1);
            }
        });
        return parks.get(0);
    }

}
