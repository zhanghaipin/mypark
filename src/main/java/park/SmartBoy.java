package park;

import java.util.Collections;
import java.util.Comparator;

/**
 * park car by parking empty number
 */
public class SmartBoy extends Boy{

    @Override
    protected Park findPark() {
        Collections.sort(parks, new Comparator<Park>() {
            @Override
            public int compare(Park p1, Park p2) {
                return p2.getEmptyCarNum()-p1.getEmptyCarNum();
            }
        });
        Park park=parks.get(0);
        return park.isFull()?null:park;
    }
}
